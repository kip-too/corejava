package DataStructs.stack;

public class Cities {
public static void main(String[] args) {
    Stack<String> city = new Stack<String>();
    city.push("Nairobi");
    city.push("Kampala");
    city.push("Dar-es Salaam");
    city.push("Kigali");
    city.push("Bujumbura");
    city.push("Kinshasa");
    city.push("Juba");
    System.out.println(city);
    System.out.println(city.pop());
    

}
}
