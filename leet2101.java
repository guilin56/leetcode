import java.util.*;
//用的时间太长了，记得优化
public class leet2101 {
    public static void main(String[] args) {
//        int[][] bombs = {{1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}};
        int[][] bombs = {{634,440,278},{748,509,396},{995,881,251},{704,214,341},{832,972,238},{987,384,156},{378,988,402},{743,557,252},{814,868,196},{131,922,199},{13,398,444},{464,607,241},{426,128,81}};//12
//        int [][]bombs=new int[][]{{1,1,5},{10,10,5}};
        int i = maximumDetonation(bombs);
        System.out.println(i);

    }

    public static int maximumDetonation(int[][] bombs) {
        if (bombs.length == 0) return 0;
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[bombs.length];
        for (int i = 0; i < bombs.length; i++) {
            List<Integer> set = new ArrayList<>();
            for (int j = 0; j < bombs.length; j++) {
                if (i == j) continue;
                double distance = Math.pow(bombs[i][0] - bombs[j][0], 2) + Math.pow(bombs[i][1] - bombs[j][1], 2);
                if (distance <= Math.pow(bombs[i][2],2)) {
                    set.add(j);
                }
            }
            list.add(set);
        }

        int result = 0, count = 1;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> l = new ArrayList<>(list.get(i));//!!!不能直接等于，会直接给地址，导致后面修改了list.get(i)也会影响l
            visited[i] = true;
            while (l.size() > 0) {
                int temp=l.remove(0);
                if (!visited[temp]) {
                    l.addAll(list.get(temp));
                    visited[temp] = true;
                    count++;
                }
            }
            result = Math.max(count, result);
            visited = new boolean[bombs.length];
            count = 1;
        }
        return result;
    }
}
