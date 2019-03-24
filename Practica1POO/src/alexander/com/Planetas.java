package alexander.com;

import javax.swing.JOptionPane;

public class Planetas {

	double pesoPlaneta;
	public void Marte(double peso) {
		pesoPlaneta = Math.round(peso/9.81)*3.711;
	JOptionPane.showMessageDialog(null,"tu peso en Marte Seria:"+pesoPlaneta);
	}
	public void Neptuno(double peso) {
		pesoPlaneta =  Math.round (peso/9.81)*11.15;
	JOptionPane.showMessageDialog(null,"tu peso en Neptuno Seria:"+pesoPlaneta);
	}
	public void Saturno(double peso) {
		pesoPlaneta =  Math.round (peso/9.81)*10.44;
	JOptionPane.showMessageDialog(null,"tu peso en Saturno Seria:"+pesoPlaneta);
	}
	public void Jupiter (double peso) {
		pesoPlaneta =  Math.round (peso/9.81)*24.79;
	JOptionPane.showMessageDialog(null,"tu peso en Jupiter Seria:"+pesoPlaneta);
	}
	public void Urano (double peso) {
		pesoPlaneta = Math.round(peso/9.81)*8.87;
	JOptionPane.showMessageDialog(null,"tu peso en Urano Seria:"+pesoPlaneta);
	}

	public void Mercurio(double peso) {
		pesoPlaneta = Math.round (peso/9.81)*3.7;
	JOptionPane.showMessageDialog(null,"tu peso en Mercurio Seria:"+pesoPlaneta);
	}

}
