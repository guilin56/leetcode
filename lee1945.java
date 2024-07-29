//浪费时间又浪费空间

public class lee1945 {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        char[] chars = s.toCharArray();
        int result = 0;
        String temp="";
        for (int i = 0; i < chars.length; i++) {
            temp += (Integer.valueOf(chars[i]) - 96);
        }
        while (k>0){
            chars=temp.toCharArray();
            temp="";
            result=0;
            for(int i=0;i<chars.length;i++){
                result+=Integer.valueOf(chars[i]+"");
                temp=result+"";
            }
            k--;
        }

        return result;
    }
}
