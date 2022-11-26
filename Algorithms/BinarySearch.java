package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int target = 50;

        for(int i = 0;i<array.length;i++){
            array[i] = i;
        }
        System.out.println(array);
        int index = binarySearch(array, target);

        if(index == -1){
            System.out.println(target +"Not Found");
        } else {
            System.out.println("Target found at" + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low =0;
        int high= array.length-1;
         
        while(low <= high){
          int middle = low + (high - low)/2;
          int value = array[middle];
          System.out.print("Middle" +middle);

          if(value < target) low = middle + 1;
          else if(value > target) high = middle -1;
          else return middle;
        }
        return -1;
    }
}
