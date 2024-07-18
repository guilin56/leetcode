import java.util.HashMap;
import java.util.Map;

public class leet925 {
    public static void main(String[] args) {
        String name = "xnhtq", typed = "xhhttqq";
        System.out.println(isLongPressedName(name,typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        for (char i : name.toCharArray()) {
            if (map.get(String.valueOf(i)) == null) {
                map.put(String.valueOf(i), 1);
            } else {
                map.put(String.valueOf(i), map.get(String.valueOf(i)) + 1);
            }
        }
        for (char i : typed.toCharArray()) {
            if (map1.get(String.valueOf(i)) == null) {
                map1.put(String.valueOf(i), 1);
            } else {
                map1.put(String.valueOf(i), map1.get(String.valueOf(i)) + 1);
            }
        }
        for (char i : name.toCharArray()) {
           if(map.size()!=map1.size() ){
               return false;
            }
           if(map1.get(String.valueOf(i))==null){
               return false;
           }
           if(map.get(String.valueOf(i))>map1.get(String.valueOf(i))){
               return false;
           }
        }
        return true;
    }
}
