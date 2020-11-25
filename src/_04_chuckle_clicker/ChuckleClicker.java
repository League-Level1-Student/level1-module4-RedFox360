package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JButton joke, punchline;
public void run() {
	frame = new JFrame();
	frame.setVisible(true);
	panel = new JPanel();
	joke = new JButton("Joke");
	punchline = new JButton("Punchline");
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);
	frame.pack();
	joke.addActionListener(this);
	punchline.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println(((JButton)e.getSource()).getText() + " was pressed");
	if(e.getSource()==joke) {
		JOptionPane.showMessageDialog(frame, "What's the best thing about Switzerland?");
	}
	if(e.getSource()==punchline) {
		JOptionPane.showMessageDialog(frame, "I don't know, but the flag is a big plus.");
	}
}
}
