public class leet3106 {
    public static void main(String[] args) {
        //  'a'=97+12+12  中间数 m/n 122-97
        char t = 'm';
        String s="mxr";
        int k=17;
        System.out.println(getSmallestString(s,k));

    }

    public static String getSmallestString(String s, int k) {
        if (k == 0) return s;
        char[]result = s.toCharArray();
        int temp;
        for (int i = 0; i < result.length; i++) {
            int distance = Integer.valueOf(result[i]);
            temp = distance <= 109 ? distance - 97 : 26 - distance + 97;
            if (k >= temp) {
                result[i] = 'a';
                k -= temp;
            } else {
                result[i] =  Character.toChars(distance - k)[0];
                break;
            }
        }
        return String.copyValueOf(result);
    }
}
