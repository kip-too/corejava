package functional;

import java.util.stream.IntStream;

public class Madhava {
    public static void main(String[] args) {
        double pi = Math.sqrt(12)*
                    IntStream.range(0, 100)
                              .mapToDouble(k -> Math.pow(-3, -1 * k) / (2*k))
                              .sum();
                              System.out.println(pi);
    }
}
