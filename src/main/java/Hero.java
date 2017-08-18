import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private int mAge;
  private String mAbility;
  private String mWeakness;

  public Hero(String name, int age, String ability) {
    mName = name;
    mAge = age;
    mAbility = ability;
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
}
