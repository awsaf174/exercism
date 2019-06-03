import java.util.ArrayList;

class ArmstrongNumbers {

	private double sum = 0;
	private ArrayList<Integer> rem = new ArrayList<Integer>();
	private int digits = 0;

	boolean isArmstrongNumber(int numberToCheck) {
		int temp = numberToCheck;
		while(temp != 0) {
			rem.add(temp%10);
			temp = temp/10;
			digits++;
		}
		for(int i = 0; i<rem.size(); i++) {
			sum = sum + Math.pow(rem.get(i), digits);
		}
		if(sum == numberToCheck) {
			return true;
		}
		else {
			return false;
		}

	}

}
