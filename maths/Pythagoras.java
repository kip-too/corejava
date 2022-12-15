package maths;

public class Pythagoras {
    public static void pythagoras(int x){
     double y;
     double z;
     //60=a
     //30=b
     //90=c
     y = (x /Math.sin(30))*Math.sin(60);
     z = (x/Math.sin(30))*Math.sin(90);
    System.out.println(y +" "+ z);
    }

    public static void main(String[] args) {
        pythagoras(1);
    }
}
