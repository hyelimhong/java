package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의카운터프로그램 {

	
	static int count;
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle(" 나의 카운터 프로그램");
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JLabel number = new JLabel("0");
		number.setForeground(new Color(255, 0, 0));
		number.setFont(new Font("굴림", Font.BOLD, 30));
		number.setBounds(117, 137, 108, 42);
		f.getContentPane().add(number);
		
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				number.setText(count + "");
			}
		});
		btnNewButton.setBounds(12, 20, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = count - 1;
					number.setText(count + "");
			}
		});
		btnNewButton_1.setBounds(138, 20, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		JButton btnNewButton_2 = new JButton("0으로 초기화");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			count = 0;
				number.setText(count + "");
			}
		});
		btnNewButton_2.setBounds(83, 69, 108, 30);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);

	}
}
