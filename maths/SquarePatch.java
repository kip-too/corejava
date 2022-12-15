package maths;

public class SquarePatch {

    public static int[][] squarePatch(int n){
      int[][] finalArray = new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            finalArray[i][j]=n;
        }
        System.out.println(finalArray);
      }
    return finalArray;
    }

    public static void main(String[] args) {
        System.out.println(squarePatch(5));
    }

}
