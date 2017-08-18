import java.util.ArrayList;
import java.util.List;

public class Squad {
  private String mName;
  private int mMaxSize;
  private String mReason;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeros;

  public Squad(String name, int maxSize, String reason) {
    mName = name;
    mMaxSize = maxSize;
    mReason = reason;
    instances.add(this);
    mId = instances.size();
    mHeros = new ArrayList<Hero>();
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

  //returning all instances
  public static List<Squad> all() {
    return instances;
  }

  //clear squad instances
  public void clear() {
    instances.clear();
  }

  //returning the id of a squad
  public int getId() {
    return mId;
  }

  //returns a list of heroes in a squad
  public List<Hero> getHeros() {
    return mHeros;
  }

  // adds heroes to a Squad
	public void addHero(Hero hero) {
			mHeros.add(hero);
  }
}
