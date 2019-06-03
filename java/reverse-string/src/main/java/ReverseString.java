class ReverseString {

    String reverse(String inputString) {
      StringBuilder res = new StringBuilder(inputString);
      res.reverse();
      return res.toString();
    }

}
