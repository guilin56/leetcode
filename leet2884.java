public class leet2884 {
    public static void main(String[] args) {

       System.out.println(minimumOperations("5"));

    }

    public static int minimumOperations(String num) {
        //只要让最后两位是00 25 75 50 就行
        int len = num.length();
        if (len<2)return num.indexOf('0')==-1 ? len : len-1;
        int result = Integer.MAX_VALUE;
        int i = num.lastIndexOf('0');
        if(i!=-1){//00 50情况
            int j =num.substring(0,i).lastIndexOf('0');
            int k=num.substring(0,i).lastIndexOf('5');
            if (j!=-1) result=Math.min((len-1-i)+(i-j-1),result);
            if(k!=-1)result=Math.min((len-1-i)+(i-k-1),result);
        }

        int i1 = num.lastIndexOf('5');
        if(i1 >= 1 ){
            int i2 = num.substring(0,i1).lastIndexOf('7');
            int i3=num.substring(0,i1).lastIndexOf('2');
            if(i2!=-1) result=Math.min(len-1-i1+i1-i2-1,result);
            if(i3!=-1) result=Math.min(len-1-i1+i1-i3-1,result);
        }
        if (result==Integer.MAX_VALUE){
            return num.indexOf('0')==-1 ? len : len-1;
        }
        return result;
    }
}
