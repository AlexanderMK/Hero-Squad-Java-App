import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private int mAge;
  private String mAbility;
  private String mWeakness;
  private static List<Hero> instances = new ArrayList<Hero>();

  public Hero(String name, int age, String ability, String weakness) {
    mName = name;
    mAge = age;
    mAbility = ability;
    mWeakness = weakness;
    instances.add(this);
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
}
