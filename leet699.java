import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//耗时太多。。。还有优化空间
public class leet699 {
    public static void main(String[] args) {
        int[][] positions = {{1,2},{2,3},{6,1}};
        int [][] test={{6,1},{9,2},{2,4}};
//        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(fallingSquares(test));
    }

    public static List<Integer> fallingSquares(int[][] positions) {
        List<Map> dis = new ArrayList<>();//记录每个方块所在的位置及其高度
        List<Integer> result = new ArrayList<>();
        int max = 0,maxTemp=0;
        for (int[] pos : positions) {
            Map<String, Integer> map = new HashMap<>();
            if (dis.size() == 0) {
                map.put("start", pos[0]);
                map.put("end", pos[0] + pos[1]);
                map.put("Height", pos[1]);
                max=pos[1];
                dis.add(map);
            } else {
                for (Map<String, Integer> temp : dis) {
                    if ((pos[0] >= temp.get("start") & pos[0] < temp.get("end")) ||
                            (temp.get("start") >= pos[0] & temp.get("start") < pos[0] + pos[1])) {
                        maxTemp=Math.max(maxTemp,temp.get("Height"));
                    }
                }
                map.put("start", pos[0]);
                map.put("end", pos[0] + pos[1]);
                map.put("Height", maxTemp+pos[1]);
                max=Math.max(max,maxTemp+pos[1]);
                maxTemp=0;
                dis.add(map);
            }
            result.add(max);
        }

        return result;
    }
}
