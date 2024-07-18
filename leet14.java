import java.util.*;

public class leet14 {
    public static void main(String[] args) {
     String[] strs=new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        List<String> list = Arrays.asList(strs);
        int len;
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        len=list.get(0).length();
        for(int i=list.get(0).length();i>0;i--){
            String temp=list.get(0).substring(0,i);
            for(int j=0;j<list.size();j++){
                if(!list.get(j).substring(0,i).equals(temp)){
                    len--;
                    break;
                }
                if(j==list.size()-1){
                    return list.get(0).substring(0,len);
                }
            }

        }

       return "";
    }
}
