package alexander.com;

import javax.swing.JOptionPane;

public class ejercicio {

	public static void main(String[] args) {
	     double PesoT = 60 ;
	     int Opcion;
	    String aux ;
	    
	    aux = JOptionPane.showInputDialog("Digite:\n1-Marte\n2-Neptuno\n3-Saturno\n4-Jupiter\n5-Urano\n6-Mercurio");
	    Opcion= Integer.valueOf(aux);
	    Planetas Obj = new Planetas();
	    switch (Opcion) {
			case 1:
				Obj.Marte(PesoT);
				break;
			case 2:
				Obj.Neptuno(PesoT);
				break;
			case 3:
				Obj.Saturno(PesoT);
				break;
			case 4:
				Obj.Jupiter(PesoT);
				break;
			case 5:
				Obj.Urano(PesoT);
				break;
			case 6:
				Obj.Mercurio(PesoT);
				break;
			default:
				break;
		}
     
	}
	//Comentario ejemplo

}
