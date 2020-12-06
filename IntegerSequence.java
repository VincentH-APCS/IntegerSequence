import java.util.NoSuchElementException;

public interface IntegerSequence{
  boolean hasNext();
  int next();
  int length();
  void reset();
}

public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    start = this.start;
    end = this.end;
    current = this.start;
  }
  public void reset(){
    current = start;
  }

  public int length(){
    return end - start;
  }

  public boolean hasNext(){
      return current < end;
  }

  public int next(){
    try{ this.hasNext();
    } catch (NoSuchElementException e){
      System.out.println("There is no Next Element");
    }
    current = current++;
    return current - 1;
  }
}

public static void main(String[] args){
  IntegerSequence r = new Range(10, 15);
  while(r.hasNext()){
    System.out.println(r.next())
    if(r.hasNext() ){
      System.out.println( " , ");
    }
  }
  System.out.println();
}
