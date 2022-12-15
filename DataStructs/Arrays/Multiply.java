package DataStructs.Arrays;

import java.util.List;

public class Multiply {
  
  public static List funct(int num1,int num2){
    List<Integer> multiple = new java.util. ArrayList<Integer>();
    for(int i=1;i<num2+1;i++){
        multiple.add(num1*i);
    }
    return multiple;
   }

   public static void main(String[] args) {
    System.out.println(funct(20, 20));
   }
   
  }

