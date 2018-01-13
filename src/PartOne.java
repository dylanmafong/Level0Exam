import javax.swing.JOptionPane;

public class PartOne {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("how many inches tall are you");
	int heights = Integer.parseInt(height);
	int x = 60 - heights; 
	if (heights < 60) {
		JOptionPane.showMessageDialog(null, "you need to grow " + x + " inches");
	}
	else {
		JOptionPane.showMessageDialog(null, "enjoy the ride");
}
}
}
