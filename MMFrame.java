
import javax.swing.JFrame;

public class MMFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("MMouse");  //
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 
		frame.setSize(1400, 1400); //

		MMouse r = new MMouse();
		frame.add(r);

		frame.setVisible(true);
	}
}

           
