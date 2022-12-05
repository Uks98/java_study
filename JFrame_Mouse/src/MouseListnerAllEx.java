//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class MouseListnerAllEx extends JFrame{
//	private JLabel la = new JLabel("NO MOUSE Event");
//	
//	public MouseListnerAllEx() {
//		setTitle("mouseListner와 MouseListener예제");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		
//		MyMouseListner listner = new MyMouseListner();
//		c.addMouseListener(listner);
//		c.addMouseMotionListener(listner);
//		
//		c.add(la);
//		
//		setSize(300,200);
//		setVisible(true);
//	}
//		
//		
//	class MyMouseListner implements MouseListener,MouseMotionListener{
//
//		@Override
//		public void mouseDragged(MouseEvent e) {
//			// TODO Auto-generated method stub
//			la.setText("mouseDragged ("+e.getX()+","+e.getY() + ")");
//		}
//
//		@Override
//		public void mouseMoved(MouseEvent e) {
//			// TODO Auto-generated method stub
//			la.setText("mouseMoved ("+e.getX()+","+e.getY() + ")");
//		}
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			la.setText("mousepressed ("+e.getX()+","+e.getY() + ")");
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			la.setText("mouseReleased ("+e.getX()+","+e.getY() + ")");
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			la.setText("mouseExited ("+e.getX()+","+e.getY() + ")");
//		}
//		
//		
//	}
//	public static void main(String[] args) {
//		new MouseListnerAllEx();
//	}
//
//}
