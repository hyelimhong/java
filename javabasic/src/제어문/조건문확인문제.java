package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 조건문확인문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		
		JFrame f = new  JFrame();
		
	
		f.getContentPane().setBackground(new Color(197, 235, 250));
	
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(41, 53, 141, 18);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(41, 128, 141, 18);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(41, 238, 128, 18);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_3.setBounds(41, 298, 97, 18);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(260, 53, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(260, 125, 116, 21);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(260, 235, 116, 21);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(260, 295, 116, 21);
		f.getContentPane().add(t4);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n1 = t1.getText();
				
				if (n1.equals("아메리카노") || n1.equals("아이스 아메리카노") || n1.equals("라떼")) {
					JOptionPane.showMessageDialog(f, "카페 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "물드세요.");
				}
			}
		});
		b1.setBounds(161, 84, 155, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n2 = t2.getText();
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, "나의 내년 나이는" + (n22 + 1));
			}
			
		});
		b2.setBounds(161, 175, 155, 23);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("두과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n3 = t3.getText();
				String n4 = t4.getText();
				
				int n33 = Integer.parseInt(n3);
				int n44 = Integer.parseInt(n4);
				
				JOptionPane.showMessageDialog(f, "평균은" + (n33 + n44) / 2);
				
				
			}
		});
		b3.setBounds(161, 343, 167, 23);
		f.getContentPane().add(b3);
		
		f.setVisible(true);
		

	}
}
