public class leet3105 {
    public static void main(String[] args) {
        int [] arr=new int[]{3};
        int i = longestMonotonicSubarray(arr);
        System.out.println(i);
    }

    public static int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int tempAdd=1,tempRed=1,count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                tempAdd++;
            }else{
                tempAdd=1;
            }
            if(nums[i]<nums[i-1]){
                tempRed++;
            }else{
                tempRed=1;
            }
        count=Math.max(Math.max(tempAdd,tempRed),count);
        }
        return count;
    }
}
