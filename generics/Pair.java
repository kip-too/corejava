package generics;

 class Pair<R,S>{
    public R fst;
    public S snd;
    public Pair(R fst, S snd){
      this.fst=fst;
      this.snd=snd;
    }

    public String toString(){
        return "("+fst+","+snd+")";
    }

public static void main(){
Pair<Integer,String> pintstr = new Pair<Integer,String>(4, "yo");
System.out.println("pintstr:"+pintstr);
pintstr.fst=12;
int left = pintstr.fst;
String right= pintstr.snd;
System.out.println("as parts : fst=" +left+",snd="+right);
}
 }