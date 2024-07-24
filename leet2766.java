import java.util.*;
//超出内存限制
public class leet2766 {
    public static void main(String[] args) {
        int [] nums={1,6,7,8},moveFrom={1,7,2},moveTo={2,9,5};
        System.out.println(relocateMarbles(nums,moveFrom,moveTo).toString());

    }

    public static List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> result=new TreeSet<>();
        for (int i : nums) {
            result.add(i);
        }
        for (int i = 0; i < moveTo.length; i++) {
          result.remove(moveFrom[i]);
          result.add(moveTo[i]);
        }

        return new ArrayList<>(result);
    }
}
