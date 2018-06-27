
public class calculate {
	
	public double calculateMaxEpley(double weight, int reps){
		double max =0;
		if(reps>1){
		max = weight*(1+reps/30);
		}else{
			max = weight;
		}
		return max;
	}
	public double calculateMaxBryzcki(double weight, int reps){
		double repss = reps;
		double max = 0;
		max = weight*(36/(37-repss));
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate x = new calculate();
	
		System.out.print(x.calculateMaxEpley(225, 6));
	}

}
