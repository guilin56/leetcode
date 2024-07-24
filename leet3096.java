import java.util.Arrays;

public class leet3096 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1};
        int i = minimumLevels(arr);
        System.out.println(i);
    }

    public static int minimumLevels(int[] possible) {
        int count = 0, count1 = 0;
        for (int i = 0; i < possible.length; i++) {
            count1 += (possible[i] > 0 ? 1 : -1);
        }
        for (int i = 0; i < possible.length - 1; i++) {
            if (possible[i] > 0) {
                count++;
                count1--;
            } else {
                count--;
                count1++;
            }
            if (count > count1) {
                return i + 1;
            }
        }
        return -1;
    }

}
