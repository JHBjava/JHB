package abc.Admin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Attribute extends JInternalFrame implements ActionListener {
	JDesktopPane desktop1 = new JDesktopPane();
	
	public Attribute() {
		//Frame
		this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		this.setVisible(true);
		desktop1.setBackground(Color.LIGHT_GRAY);
		desktop1.setLayout(null);
		//Add
		this.add(desktop1);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}