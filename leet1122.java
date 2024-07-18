
import java.util.*;
//非常耗时,空间还行
import static java.util.Arrays.binarySearch;

public class leet1122 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = new int[]{2, 1, 4, 3, 9, 6};
        int[] arr3=new int[]{28,6,22,8,44,17},arr4=new int[]{22,28,8,6,17,44};
        for (int i : relativeSortArray(arr1, arr2)) {
            System.out.println(i);
        }
    }


    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int k = 0;
        List<Integer> different = new ArrayList<>(), arr3=new ArrayList<>(),arr4=new ArrayList<>();

        for(int a :arr2){
            arr3.add(a);
        }
        for(int a :arr1)
            arr4.add(a);

        for (int i : arr2) {
            for (int j = 0; j < arr4.size(); j++) {
                if(!arr3.contains(arr4.get(j))){
                    different.add(arr4.get(j));
                    arr4.remove(j);
                    j--;
                    continue;
                }
                if (i == arr4.get(j)) {
                    res[k] = i;
                    arr4.remove(j);
                    j--;
                    k++;
                }
            }

        }
        Collections.sort(different);
        for (int i = 0; i < different.size(); i++) {
            res[k] = different.get(i);
            k++;
        }
        return res;
    }
}
