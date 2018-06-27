
public class calculate {
	
	public double calculateMaxEpley(double weight, int reps){
		double max =0;
		max = weight*(1+reps/30);
		return max;
	}
	public double calculateMaxBryzcki(double weight, int reps){
		double max = 0;
		max = weight*(36/37-reps);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
