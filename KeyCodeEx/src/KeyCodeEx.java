import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame{
	
	private JLabel la = new JLabel();
	Container c;
	
	public KeyCodeEx() {
		setTitle("key code 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e ) {
			KeyCodeEx keycode = new KeyCodeEx();
			la.setText(e.getKeyText(e.getKeyCode()));
			if(e.getKeyChar() == '%')
				keycode.c.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				keycode.c.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
		
	}

}
