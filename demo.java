public class demo{

public static void main(String[] args){
  IntegerSequence r = new Range(10,20);
  IntegerSequence as = new ArraySequence(r);

  System.out.println("ArraySequence(r)");
  while(as.hasNext()){
    System.out.print(as.next()+", ");
  }
  System.out.println();
  as.reset();
  System.out.println(as.next());
  System.out.println(as.next());
  System.out.println(as.hasNext());
  System.out.println(as.length());
  }
}
