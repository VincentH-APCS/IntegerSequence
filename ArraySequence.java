import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public void reset(){
    currentIndex = 0;
  }
  public int length(){
    return data.length;
  }
  public boolean hasNext(){
    return currentIndex < data.length;
  }
  public int next(){
    if(currentIndex > data.length){
      throw new NoSuchElementException("You have reached the end, " + data.length
      + " . There is no element afterwards");
    }
    currentIndex = currentIndex + 1;
    return data[currentIndex - 1];
  }
  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    int count = 0;
    otherseq.reset();
    while(otherseq.hasNext()){
      data[count] = otherseq.next();
      count = count + 1;
    }
    otherseq.reset();
  }
}
