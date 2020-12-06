import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    this.start = start;
    this.end = end;
    this.current = start;
  }
  public void reset(){
    current = start;
  }

  public int length(){
    return end - start;
  }

  public boolean hasNext(){
      return current <= end;
  }

  public int next(){
    try{ this.hasNext();
    } catch (NoSuchElementException e){
      System.out.println("There is no Next Element");
    }
    current = current + 1;
    return current - 1;
  }
}
