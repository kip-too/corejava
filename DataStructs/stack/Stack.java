package DataStructs.stack;

import java.util.ArrayList;
import java.util.List;

 public class Stack<T> {
    private List<T> a= new ArrayList<T>();

    private void push(T x){
       a.add(x);
    }

    public T pop(){
        if(a.isEmpty())
         throw new IllegalStateException();
         else
          return a.remove(0);
    }
 }