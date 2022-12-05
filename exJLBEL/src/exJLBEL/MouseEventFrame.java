package exJLBEL;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.MouseEvent;

public class MouseEventFrame extends JFrame{
	public MouseEventFrame() {
		setTitle("마우스 올리기 내리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Love java");
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(label);
		
		la.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e ) {
				JLabel la = (JLabel)e.getSource();
				la.getText();
				
			}
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("love you");
			}
		});
		setSize(250,150);
		setVisible(true);
		
	};
	
	public static void main(String[] args) {
		new MouseEventFrame();
	}

}
