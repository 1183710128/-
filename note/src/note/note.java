package note;

import java.awt.Font;

import javax.swing.*;

public class note{
	public static void main(String[] args) {
		JFrame frame = new JFrame("±„«©1.0");
		frame.setBounds(0, 0, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		frame.add(producePanel());
		frame.setVisible(true);
	}
	
	private static JScrollPane producePanel() {
		JScrollPane scrollPanel = new JScrollPane();
//		scrollPanel.setBounds(50, 50, 10, 200);
		scrollPanel.setViewportView(produceTextArea());
		return scrollPanel;
	}
	
	private static JTextArea produceTextArea() {
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("µ»œﬂ", Font.PLAIN, 15));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		return textArea;
	}
}