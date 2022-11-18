package Algorithms;
/**Insertion for an array of characters into non-decreasing order */
public class InsertionSort{
    public static void main(char[] a){
        int n = a.length;
        for (int i=1;i<n;i++){//index from the second character in a
            char cur =a[i];   //current character to be inserted 
            int j=i-1;        //start comparing with cell left of i
            while((j>=0) && (a[j] > cur))//while a[j] is out of order with cur
            a[j+1]=a[j--];//move [j] right and decrement j
            a[j+1]=cur;//this is the proper place for cur
        }
    }
}