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
    return end - start + 1;
  }

  public boolean hasNext(){
      return current <= end;
  }

  public int next(){
    if(current > end){
      throw new NoSuchElementException("You have reached the end, " + end
      + " . There is no element afterwards");
    }
    current = current + 1;
    return current - 1;
  }
}
//:]
