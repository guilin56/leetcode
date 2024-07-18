public class leet2956 {
    public static void main(String[] args) {
       int [] nums1 = {4,3,2,3,1};
       int [] nums2 = {2,2,5,2,3,6};
        for (int intersectionValue : findIntersectionValues(nums1, nums2)) {
            System.out.println(intersectionValue);
        }


    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result=new int[2];
        boolean[] sign=new boolean[nums2.length];
        boolean flag=false;
        for(int i : nums1){
            for(int j=0 ;j<nums2.length;j++){
                if (i==nums2[j]){
                    if(!sign[j]){
                        result[1]++;
                        sign[j]=true;
                    }

                    flag=true;
                }
            }
            if(flag){
                result[0]++;
                flag=false;
            }
        }
        return result;
    }

}
