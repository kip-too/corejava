package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class Fibbonacci {
    int n;
    int fib;
    private static Map<Integer, Integer> memo = new HashMap<>();
  public static void main(String[] args) {
  System.out.println(fibonacci(6));
  System.out.println(fibonacci(7));
  System.out.println(fibonacci(8));
  System.out.println(fibonacci(40));
  }

private static int fibonacci(Integer n) {
    if(memo.containsKey(n)){
      return memo.get(n);
   }
    if(n<0) {
        throw new IllegalArgumentException("Index Out of bounds");
    }

if(n <= 2) return 1;
int fib=fibonacci(n-1) + fibonacci(n-2);
memo.put(n, fib);

return fib;
}
} 
