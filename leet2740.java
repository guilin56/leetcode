import java.util.Arrays;
//空间还可以优化
public class leet2740 {
    public static void main(String[] args) {
        int [] nums=new int[]{1,3,2,4};
        System.out.println(findValueOfPartition(nums));
    }
    public static int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int minx=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            minx=Math.min(Math.abs(nums[i]-nums[i+1]),minx);
        }
        return minx;
    }
}
