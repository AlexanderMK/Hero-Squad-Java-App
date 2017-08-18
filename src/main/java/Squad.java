import java.util.ArrayList;
import java.util.List;

public class Squad {
  private String mName;
  private int mMaxSize;
  private String mReason;

  public Squad(String name, int maxSize, String reason) {
    mName = name;
    mMaxSize = maxSize;
    mReason = reason;
  }

  public String getName() {
    return mName;
  }

  //returns the maximum size
	public int getMaximumSize() {
		return mMaxSize;
  }

  //returns reason to join a squad
	public String getReason() {
		return mReason;
	}




}
