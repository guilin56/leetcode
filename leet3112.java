import java.util.Arrays;

//有错！记得改
public class leet3112 {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = new int[][]{{0, 1, 2}, {1, 2, 1}, {0, 2, 4}};
        int[] disappear = new int[]{1, 3, 5};

        int[][] test = new int[][]{{2, 3, 2}, {4, 4, 9}, {4, 0, 10}, {4, 3, 4}, {4, 0, 3}};
        int[] test1 = new int[]{8, 20, 10, 17, 19};

//        int [][]

        for (int i : minimumTime(5, test, test1)) {
            System.out.println(i);
        }
    }

    //找出最少时间，如果到达你的最短时间多余你的消失时间就是-1
    public static int[] minimumTime(int n, int[][] edges, int[] disappear) {
        int[][] distance = new int[n][n];//二维矩阵准备深度搜索distance
        int[] beeline = new int[n];//记录最短距离
        Arrays.fill(beeline, Integer.MAX_VALUE);
        for (int[] i : edges) {
            distance[i[0]][i[1]] = distance[i[0]][i[1]] == 0 ? i[2] : Math.min(distance[i[0]][i[1]], i[2]);
            distance[i[1]][i[0]] = distance[i[1]][i[0]] == 0 ? i[2] : Math.min(distance[i[1]][i[0]], i[2]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (distance[i][j] == 0) distance[i][j] = 1000000;

                if (j == 0) beeline[j] = 0;

                else {
                    beeline[j] = Math.min(beeline[j], beeline[i] + distance[i][j]);
                    beeline[i] = Math.min(beeline[i], beeline[j] + distance[j][i]);
                    if (beeline[j] >= disappear[j]) {
                        beeline[j] = 1000000;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (beeline[i] == 1000000) beeline[i] = -1;
        }
        return beeline;
    }
}
