package _05_typing_tutor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	char currentLetter;
	public void setup() {
		frame = new JFrame();
		frame.setTitle("TYPE OR DIE!");
		frame.setPreferredSize(new Dimension(300, 100));
		frame.setVisible(true);
		panel = new JPanel();
		label = new JLabel();
		label.setText("" + currentLetter);
		panel.add(label);
		frame.add(panel);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		currentLetter = generateRandomLetter();
		frame.addKeyListener(this);
		
		frame.pack();
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.print(e.getKeyChar());
		if(currentLetter == e.getKeyChar()) {
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}
}
