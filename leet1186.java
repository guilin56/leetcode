//超时，记得改
public class leet1186 {
    public static void main(String[] args) {
        int[] arr = {1,-2,0,3};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] arr) {
        int result = Integer.MIN_VALUE,minNumber=0,temp;
        for(int i=0;i<arr.length;i++){
            temp=arr[i];
            result=Math.max(result,arr[i]);
            for(int j=i+1;j<arr.length;j++){
                temp =temp+arr[j];
                if (arr[j] < minNumber){
                    temp += minNumber;
                    minNumber=arr[j];
                    temp -= minNumber;
                }
                result=Math.max(temp,result);
            }
            minNumber=0;
        }
        return result;
    }

}
