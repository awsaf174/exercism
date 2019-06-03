import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
class ResistorColor {
  private HashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
  public ResistorColor(){
    l.put("black", 0);
		l.put("brown", 1);
		l.put("red", 2);
		l.put("orange", 3);
		l.put("yellow", 4);
		l.put("green", 5);
		l.put("blue", 6);
		l.put("violet", 7);
		l.put("grey", 8);
		l.put("white", 9);
  }
    int colorCode(String color) {
      return l.get(color);
    }

    String[] colors() {
        return l.keySet().toArray(new String[0]);
    }
}
