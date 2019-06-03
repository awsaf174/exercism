class Acronym {

  StringBuilder acronym;

  Acronym(String phrase) {

    phrase = phrase.replace('-', ' ')
                   .replaceAll("[^A-Za-z0-9\\s]", "")
                   .replaceAll("\\s+", " ")
                   .toUpperCase()
                   .trim();

    acronym = new StringBuilder();

    acronym.append(phrase.charAt(0));

    for(int i = 1; i<phrase.length(); i++ ) {
      if(!Character.isAlphabetic(phrase.charAt(i))) {
        acronym.append(phrase.charAt(i+1));
        i = i+1;
      }
    }
  }

  String get() {
    return acronym.toString();
  }

}
