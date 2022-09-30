package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 나의일기쓰기창 {
	//멤버변수
	private static JTextField t1;
	private static JTextField t2;
	
	
	
	//멤버메서드
//	public static void main(String[] args) {
		public void open() {
		JFrame f2 = new JFrame();
		f2.getContentPane().setBackground(new Color(181, 210, 209));
		f2.setSize(500, 700);
		f2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(39, 85, 122, 38);
		f2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(39, 174, 122, 38);
		f2.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel_2.setBounds(39, 272, 122, 29);
		f2.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(173, 85, 250, 41);
		f2.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(173, 174, 250, 38);
		f2.getContentPane().add(t2);
		t2.setColumns(10);
		
		JTextArea t3 = new JTextArea();
		t3.setBounds(173, 272, 299, 144);
		f2.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 =  t2.getText();
				String s3 =  t3.getText();

				//java밖에 있는 자원들(네트워크, db, 파일, etc)을 연결할 때는
				//프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				//반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
				//이때 쓰는게 try cache
				try {
					//file.txt와 자바프로그램 간 스트림을 만들어라
					FileWriter file = new FileWriter(s1 + ".txt");
					//스트림을 통해서 데이터를 보내라
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림이 닫힐 때까지
					file.close();
				} catch (Exception e1) {
					System.out.println("파일에 저장 중 에러발생");
				}
			}
		});
		btnNewButton.setBounds(173, 454, 139, 29);
		f2.getContentPane().add(btnNewButton);
		f2.setVisible(true);
		
		
	}
}
