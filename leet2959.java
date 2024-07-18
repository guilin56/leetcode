//困难,暂时放弃
public class leet2959 {
    public static void main(String[] args) {
      int n=3,maxDistance=2;
      int [][]roads=new int[][] {{0,1,2},{1,2,10},{0,2,10}};
      int test[][]=new int[][]{{0,1,20},{0,1,10},{1,2,2},{0,2,2}};
        int i = numberOfSets(n, maxDistance, test);
//        System.out.println(i);
    }
    public static int numberOfSets(int n, int maxDistance, int[][] roads) {
            int [][] road=new int[n][n];
            for(int[] t: roads){
                road[t[0]][t[1]]=t[2];
            }
            for(int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(road[i][j]+",");
                }
                System.out.println();
            }

            return 0;
    }
}
