import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	
	ContentPaneEx(){
		setTitle("contentPane과 jframe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container pane = getContentPane();
		pane.setBackground(Color.orange);
		pane.setLayout(new BorderLayout());
		
		pane.add(new JButton("ok"));
		pane.add(new JButton("cancel"));
		pane.add(new JButton("ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
