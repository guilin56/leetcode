import java.util.*;
//！！！超时
public class leet721 {
    public static void main(String[] args) {

        String[][] data = {
                {"Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"},
                {"Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"},
                {"Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"},
                {"Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"},
                {"Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"}
        };

        List<List<String>> accounts = new ArrayList<>();
        for (String[] subArray : data) {
            accounts.add(Arrays.asList(subArray));
        }
        List<List<String>> lists = accountsMerge(accounts);
        System.out.println(lists.toString());
    }

    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        boolean flag = false;
        List<List<String>> result = new ArrayList<>();
        List<List<String>> input = new ArrayList<>(accounts);

        for (List<String> l : accounts) {//对每个元素循环
            Set<String> temp = new TreeSet<>();
            for (int i = 1; i < l.size(); i++) {//每个元素内部循环
                for (int j = 0; j < input.size(); ) {//对每个元素循环,有的话就全部加进去,加进去之后要怎么处理?
                    if (input.get(j).contains(l.get(i)) ) {
                        if(!l.equals(input.get(j))) flag=true;
                        temp.addAll(input.get(j));
                        input.remove(j);
                    } else j++;
                }
            }
            if (temp.size() > 0) result.add(new ArrayList<>(temp));
        }

        if(!flag){
            for(int i=0;i< accounts.size();i++){
                accounts.set(i,new ArrayList<>(new TreeSet<>(accounts.get(i))));
            }
        }
        return flag?accountsMerge(result):accounts;
    };
}
