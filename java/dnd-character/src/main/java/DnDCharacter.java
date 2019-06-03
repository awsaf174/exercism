
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
class DnDCharacter {

  private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int hitpoints;
	private ArrayList<Integer>values = new ArrayList<Integer>();
	private Random r = new Random();

  public DnDCharacter() {
		this.strength = rolldices();
		this.dexterity = rolldices();
		this.constitution = rolldices();
		this.intelligence = rolldices();
		this.wisdom = rolldices();
		this.charisma = rolldices();
		this.hitpoints = 10 + modifier(this.constitution);
	}

  public int rolldices() {
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			values.add(r.ints(1, 7).findFirst().getAsInt());
		}

		Collections.sort(values);

		for(int i = 1; i < 4; i++ ) {
			sum = sum + values.get(i);
		}

		values.clear();

    return sum;
	}

  int ability() {
    return intelligence;
  }
  int modifier(int input) {
    double modifier = (double)(input-10)/2;
		return (int)Math.floor(modifier);
  }
  int getStrength() {
    return strength;
  }

  int getDexterity() {
    return dexterity;
  }

  int getConstitution() {
    return constitution;
  }

  int getIntelligence() {
    return intelligence;
  }

  int getWisdom() {
    return wisdom;
  }

  int getCharisma() {
    return charisma;
  }

  int getHitpoints() {
    return hitpoints;
  }
}
