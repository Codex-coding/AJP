import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo1 extends Frame implements MouseListener {

public MouseEventDemo1() {
// Frame properties
setSize(400, 300);
setTitle("AWT Mouse Event Example");
setLayout(null);
setVisible(true); // Initially hidden

// Adding MouseListener to the Frame
addMouseListener(this);
}

// Mouse event handlers
@Override
public void mouseClicked(MouseEvent e) {
System.out.println("Mouse Clicked at X:" + e.getX() + " Y:" + e.getY());
}

@Override
public void mouseEntered(MouseEvent e) {
System.out.println("Mouse Entered the Frame");
setVisible(true); // Make frame visible
}

@Override
public void mouseExited(MouseEvent e) {
System.out.println("Mouse Exited the Frame");
setVisible(false); // Hide frame
}

@Override
public void mousePressed(MouseEvent e) {}

@Override
public void mouseReleased(MouseEvent e) {}

public static void main(String[] args) {
new MouseEventDemo1();
}
}
