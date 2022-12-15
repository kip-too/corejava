package maths;

public class Rectangle {

    public static void rectangle(int x, int y, int z){
      if(z < x && z<=y)
      System.out.println(true);
      else {
        System.out.println(false);
      }
    }

    public static void main(String[] args) {
        rectangle(5, 9, 5);
        rectangle(4, 7, 4);
    }
}
