package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의주식크롤링 {
	private static JTextField t1;
	static JTextArea textArea;
	
	public static void main(String[] args) {
		JFrame	 f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 128, 128));
		f.setSize(300, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(104, 156, 80, 24);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(new Color(255, 255, 255));
		t1.setBackground(new Color(88, 88, 88));
		t1.setBounds(67, 190, 140, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		//JTextArea 지워야함
		textArea = new JTextArea();
		textArea.setBounds(12, 278, 260, 162);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("카카오");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				크롤링연습5 크롤링 = new 크롤링연습5();
				String result = 크롤링.naver("035720");
				textArea.setText(result);
				
				
			}
		});
		btnNewButton.setBounds(84, 21, 110, 34);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삼성전자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code를 주면서 크롤링 해달라고 하자
				//크롤링 연습5의 naver(code)호출
				
				크롤링연습5 크롤링 = new 크롤링연습5();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
				
			}
		});
		btnNewButton_1.setBounds(84, 65, 110, 37);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("네이버");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습5 크롤링 = new 크롤링연습5();
				String result = 크롤링.naver("035420");
			
				textArea.setText(result);
			}
		});
		btnNewButton_2.setBounds(84, 112, 110, 34);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("크롤링시작");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = t1.getText();
				크롤링연습5 크롤링 = new 크롤링연습5();
				String result = 크롤링.naver(code);
				textArea.setText(result);
				
			}
		});
		btnNewButton_3.setBounds(87, 234, 97, 23);
		f.getContentPane().add(btnNewButton_3);
		f.setVisible(true);

	}
}
