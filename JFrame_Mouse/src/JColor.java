import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.events.MouseEvent;




public class JColor extends JFrame{
	public JColor() {
		setTitle("색 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("사랑해");
		c.setBackground(Color.GREEN);
		c.add(label);
		MyMouseListener m1 = new MyMouseListener();
		c.addMouseMotionListener(m1);
		c.addMouseListener(m1);
		
		class MyMouseListener extends MouseAdapter{
			public void mouseDragged(MouseEvent e) {
				JComponent c = (JComponent) e.
				c.setBackground(Color.YELLOW);
			}
			public void mouseReleased(MouseEvent e) {
				JComponent c = (JComponent) e.getso
				c.setBackground(Color.GREEN);
			}
			
		}
		setSize(250,150);
		setVisible(true);
		
	};
	
	public static void main(String[] args) {
		new JColor();
	}

}
