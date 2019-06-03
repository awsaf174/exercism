class RnaTranscription {

  private String rnaStrand = "";

  String transcribe(String dnaStrand) {
    for(int i = 0; i<dnaStrand.length(); i++) {
      switch(dnaStrand.charAt(i)) {
        case 'G': rnaStrand = rnaStrand.concat("C");
        break;
        case 'C': rnaStrand = rnaStrand.concat("G");
        break;
        case 'T': rnaStrand = rnaStrand.concat("A");
        break;
        case 'A': rnaStrand = rnaStrand.concat("U");
        break;
        default:
      }
    }
    return rnaStrand;
  }
}
