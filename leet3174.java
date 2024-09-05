public class leet3174 {
    public static void main(String[] args) {
        clearDigits("asd12");
    }


    public static String clearDigits(String s) {
        boolean[] flag = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                flag[i] = true;
                for (int j = i; j >= 0; j--) {
                    if (!flag[j]) {
                        flag[j] = true;
                        break;
                    }
                }
            }
        }
        String result="";
        for(int i=0;i<s.length();i++){
            result+= !flag[i]?s.charAt(i):"";
        }
        return result;
    }

}
