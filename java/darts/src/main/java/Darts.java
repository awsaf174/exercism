class Darts {

private double distance;
private int points;
    Darts(double x, double y) {
      distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    int score() {
        if(distance <= 1){
          points = 10;
        }
        else if(distance > 1 && distance <= 5 ){
          points = 5;
        }
        else if(distance > 5 && distance <=10){
          points = 1;
        }
        else{
          points = 0;
        }

        return points;
    }

}
