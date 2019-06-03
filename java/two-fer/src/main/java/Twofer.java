class Twofer {
    String twofer(String name) {
      StringBuilder res = new StringBuilder();
      if(name != null) {
        name = name.trim();
        if(name.isEmpty()) {
          res.append("One for you, one for me.");
        }
        else {
          res.append("One for " + name + ", one for me.");
        }
      }
      else {
        res.append("One for you, one for me.");
      }
      return res.toString();
    }
  }
