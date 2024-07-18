public class leet1480 {
    public static void main(String[] args) {
        for (int i : runningSum(new int[]{1, 2, 3, 4})) {
            System.out.println(i);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] + (i == 0 ? 0 : result[i - 1]);
        }
        return result;
    }
}
