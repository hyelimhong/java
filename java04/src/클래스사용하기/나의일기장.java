package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의일기장 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(181, 210, 209));
		f.setSize(424,575);
		f.getContentPane().setLayout(null);
		
		JLabel id = new JLabel("아이디:");
		id.setFont(new Font("나눔고딕", Font.BOLD, 20));
		id.setBounds(85, 321, 111, 30);
		f.getContentPane().add(id);
		
		JLabel pw = new JLabel("비밀번호:");
		pw.setFont(new Font("나눔고딕", Font.BOLD, 20));
		pw.setBounds(85, 396, 100, 24);
		f.getContentPane().add(pw);
		
		t1 = new JTextField();
		t1.setBounds(228, 321, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(228, 401, 116, 21);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kang6613\\Desktop\\java\\java04\\일기장.png"));
		lblNewLabel.setBounds(12, 10, 384, 236);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				//id = root, pw 1234면 일기화면 띄우고
				//아니면 입력값이 달라 로그인 실패입니다
				//일기쓰기창을 띄워라
				
				if (s1.equals("root") && s2.equals("1234")) {
					나의일기쓰기창 diary = new 나의일기쓰기창();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f,"로그인실패");
				}
				
				
			}
		});
		btnNewButton.setBounds(77, 460, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("다시시도");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1,t2의 글자가 지워지게 공백을 집어넣어라
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setBounds(247, 460, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
				
	}
}
