package DataStructs.Arrays;

public class Trials {
    public static void main(String[] args){
        //Declare and construct the local variables
        double[] storeMinimum=new double[5];
        double[] trialArray=new double[15];
        for(int i=0;i<storeMinimum.length;i++){
           //initialize the array
           randomize(trialArray);

           //find and store the minimum value
           storeMinimum[i] = findMinimum(trialArray);
        
        }

        //print the minimum values
        for(double minValue:storeMinimum)
          System.out.printf("%.4f%n", minValue);
    }
    public static void randomize(double[] valArray){
       for(int i=0;i<valArray.length;i++){
        valArray[i] =Math.random() * 100.0;
       }
    }

    public static double findMinimum(double[] valArray){
        //Assume the array has atleast one element
        double minValue=valArray[0];
        for(int i=1;i<valArray.length;i++){
            minValue=Math.min(minValue, valArray[i]);
        }
        return minValue;
    }
}
