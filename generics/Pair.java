package generics;

public class Pair<R,S>{
    public R fst;
    public S snd;
    public Pair(R fst, S snd){
      this.fst=fst;
      this.snd=snd;
    }

    public String toString(){
        return "("+fst+","+snd+")";
    }
}