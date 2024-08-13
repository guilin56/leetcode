public class leet3151 {
    public static void main(String[] args) {
        int[] nums=new int[]{4,3,1,6};
        System.out.println(isArraySpecial(nums));
    }


    public static boolean isArraySpecial(int[] nums) {
        if (nums.length==1)return true;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]&1) == (nums[i+1]&1)){
                return false;
            }

        }
    return true;
    }
}
