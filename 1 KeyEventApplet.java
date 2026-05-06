import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventApplet extends JFrame implements KeyListener{
	private JLabel label;
	
	public KeyEventApplet() {
		
		//Frame title 
		setTitle("Key Event Demo");
		
		//Window Size
		setSize(400,300);
		
		//Close Button Operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set Layout
		setLayout(new FlowLayout());
		
		//Label creation
		label = new JLabel("Press any key...");
		label.setFont(new Font("Arial", Font.BOLD, 16));
		//add label
		add(label);
		
		//Add key listener
		addKeyListener(this);
		
		//Focus for Keyboard Input
		setFocusable(true);
		
		//Make frame visible
		setVisible(true);
			
	}
	
	//Key Pressed
	public void keyPressed(KeyEvent e) {
		label.setText("Key Pressed : " + e.getKeyChar());
	}
	
	//Key Released
	public void keyReleased(KeyEvent e) {
		label.setText("Key Released : " + e.getKeyChar());
	}
	
	//Key typed
	public void keyTyped(KeyEvent e) {
		label.setText("Key Typed : " + e.getKeyChar());
	}
	
	//Main method
	public static void main(String[] args) {
		new KeyEventApplet();
	}
	
}
