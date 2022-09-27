package 제어문;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		//1.jframe 부품을 새로 만든다
		JFrame f = new  JFrame();
		//2.부품의 크기를 결정
		f.setSize(500, 500);
		
		textField = new JTextField();
		textField.setBackground(new Color(238, 234, 145));
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 189, 222));
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("토끼다");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kang6613\\Desktop\\토끼.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		//3.부품이 보이게 설정
		f.setVisible(true);
	}

}
