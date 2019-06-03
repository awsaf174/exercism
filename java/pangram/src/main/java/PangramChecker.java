public class PangramChecker {

  private int count = 0;
  
    public boolean isPangram(String input) {

      input = input.toLowerCase();

      for(char ch = 'a'; ch<='z'; ch++ ) {

        for(int i = 0; i<input.length(); i++) {
          if(input.charAt(i) == ch) {
            count = count+1;
            break;
          }
        }
      }

      if(count == 26) {
        return true;
      }
      else {
        return false;
      }
    }
  }
