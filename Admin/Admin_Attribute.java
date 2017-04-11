package JHB.Admin;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Admin_Attribute extends JInternalFrame implements ActionListener {
	JDesktopPane DesktopPane = new JDesktopPane();
	
	public Admin_Attribute() {
		this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		this.setVisible(true);
		
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		DesktopPane.setLayout(new GridBagLayout());
		
		this.add(DesktopPane);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}