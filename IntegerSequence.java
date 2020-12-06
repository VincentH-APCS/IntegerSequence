public interface IntegerSequence{
  boolean hasNext();
  int next();
  int length();
  void reset();
}
import java.util.NoSuchElementException;
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
}
