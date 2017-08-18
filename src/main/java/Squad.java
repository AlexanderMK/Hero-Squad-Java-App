public class Squad {
  private String mName;
  private int mMaxSize;
  private String mReason;

  public Squad(String name, int maxSize) {
    mName = name;
    mMaxSize = maxSize;
  }

  public String getName() {
    return mName;
  }

  //returns the maximum size
	public int getMaximumSize() {
		return mMaxSize;
  }


}
