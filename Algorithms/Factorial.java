package Algorithms;

public class Factorial {

    public static int factorial(int n){
     if(n==1) return 1;//base step
     else{
        return n * factorial(n-1);
     }
    }

    public static void  main(String[] args){
        int n = 10;
        int fact = factorial(10);
        System.out.println("The factorial of "  +n+   "is "  +fact);
    }
}
