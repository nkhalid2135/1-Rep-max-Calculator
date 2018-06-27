
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {
	
	calculate maxCalc;
	
	public Gui(){
		maxCalc = new calculate();
		JFrame mainFrame = new JFrame();
			mainFrame.setSize(1000,1000);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainFrame.setVisible(true);
			
			
		JPanel topPanel = new JPanel();
		topPanel.revalidate();
			topPanel.setVisible(true);
			
		
		
		JTextField weightText = new JTextField();
			weightText.setSize(100,10);
			topPanel.add(weightText);
			double weight;
			try{
				weight = Double.parseDouble(weightText.getText());
			}catch(NumberFormatException e){
				System.out.println("Not a number you dumb meathead!");
			};
				
		JTextField repsText = new JTextField();
			topPanel.add(repsText);
			double reps;
			try{
				 reps = Integer.parseInt(weightText.getText());
			}catch(NumberFormatException e){
				System.out.println("Not a number you dumb meathead!");
			};
		
			
		mainFrame.getContentPane().add(topPanel);
			}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui x = new Gui();
		
	}


}
