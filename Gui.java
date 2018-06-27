
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//@Author Nabeel Khalid
public class Gui {
	
	calculate maxCalc;
	double weight = 0;
	int reps = 0;
	
	public Gui(){
		maxCalc = new calculate();
		JFrame mainFrame = new JFrame();
			mainFrame.setSize(1000,1000);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainFrame.setVisible(true);
			
			
		JPanel topPanel = new JPanel();
			topPanel.revalidate();
			topPanel.setVisible(true);
			
		
		/**
		 *  Two textfields to imput a weight and the number of reps done
		 */
		JTextField weightText = new JTextField();
			weightText.setSize(100,100);
			topPanel.add(weightText);
			//double weight = 0;
			try{
				weight = Double.parseDouble(weightText.getText());
			}catch(NumberFormatException e){
				System.out.println("Not a number you dumb meathead!");
			};
		
		JTextField repsText = new JTextField();
			topPanel.add(repsText);
			//int reps = 0;
			try{
				 reps = Integer.parseInt(weightText.getText());
			}catch(NumberFormatException e){
				System.out.println("Not a number you dumb meathead!");
			};
		/**
		 * dropDown menu to select which equation is to be used
		 */
		JComboBox options;
			String[] listofOptions = {"Epley", "Bryzcki"};
			options = new JComboBox(listofOptions);
			topPanel.add(options);
		/**
		 * once the user selects options and inputs values, approx 1rm is calculated.	
		 */
		JButton calculateButton = new JButton("Calculate 1RM");
			topPanel.add(calculateButton);
			calculateButton.addActionListener(new ActionListener(){
		        @Override
		        public void actionPerformed(ActionEvent e){
		        	String checker = (String) options.getSelectedItem();
		            if(checker.equals("Epley")){
		            	maxCalc.calculateMaxEpley(weight, reps);
		            }else if(checker.equals("Bryzcki")){
		            	maxCalc.calculateMaxBryzcki(weight, reps);
		            }
		        }
		    });
			
		mainFrame.getContentPane().add(topPanel);
			}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui x = new Gui();
		
	}


}
