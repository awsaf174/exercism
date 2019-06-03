
import java.text.DecimalFormat;

class SpaceAge {

  private double seconds;
  private double dividingseconds;
  private static DecimalFormat df = new DecimalFormat("#.##");

  SpaceAge(double seconds) {
    this.seconds = seconds;
  }

  double getSeconds() {
    return seconds;
  }

  double onEarth() {
    dividingseconds = 31557600;
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double onMercury() {
    dividingseconds = toSeconds(0.2408467) ;
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double onVenus() {
    dividingseconds = toSeconds(0.61519726) ;
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double onMars() {
    dividingseconds = toSeconds(1.8808158) ;
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double onJupiter() {
    dividingseconds = toSeconds(11.862615) ;
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double onSaturn() {
    dividingseconds = toSeconds(29.447498) ;
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double onUranus() {
    dividingseconds = toSeconds(84.016846) ;
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double onNeptune() {
    dividingseconds = toSeconds(164.79132);
    return Double.parseDouble(df.format(seconds/dividingseconds));
  }

  double toSeconds(double earthyears) {
    return earthyears * 365.25 * 24 * 60 * 60;
  }
}
