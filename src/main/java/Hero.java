import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private int mAge;
  private String mAbility;
  private String mWeakness;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mId;

  public Hero(String name, int age, String ability, String weakness) {
    mName = name;
    mAge = age;
    mAbility = ability;
    mWeakness = weakness;
    instances.add(this);
    mId = instances.size();

  }

  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
  }

  public String getAbility() {
    return mAbility;
  }

  public String getWeakness() {
    return mWeakness;
  }

  public static List<Hero> all() {
    return instances;
  }

  public static void clear() {
    instances.clear():
  }

  public int getId() {
    return mId;
  }
}
