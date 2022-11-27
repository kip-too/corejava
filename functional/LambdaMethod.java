package functional;

public class LambdaMethod {
public static void main(String[] args) {
    //craeting a method that takes a lambda expression as a parameter
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
}


    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }

}

interface StringFunction{
    String run(String str);
}
