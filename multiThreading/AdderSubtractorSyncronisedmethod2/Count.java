package Notes.AdderSubtractorSyncronisedmethod2;
public class Count {

   public int value=0;
   public int getValue() {
      return value;
  }

  public synchronized void incValue(int x) {
      value += x;
  }
}
