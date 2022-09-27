package 제어문;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의두번째윈도우 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 198, 226));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(165, 89, 225, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setForeground(new Color(6, 1, 58));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(31, 89, 69, 29);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(new Color(6, 1, 58));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBackground(SystemColor.menu);
		lblNewLabel_1.setBounds(31, 163, 97, 29);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(165, 163, 225, 21);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//plus 버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다
				JOptionPane.showMessageDialog(f, "플러스버튼을 누르셨군요.");
				//2개의 수를 가지고 오기 String
				String n1 = t1.getText();
				String n2 = t2.getText();
				//숫자로 변경해야함
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				//결과를 출력
				//JOptionPane.showMessageDialog(f, n11 + n22);
				//라벨에다 넣을 때는 result.setText
				f.setTitle("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
			}
		});
		plus.setBackground(new Color(193, 193, 255));
		plus.setBounds(12, 226, 97, 23);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				
				String n3 = t1.getText();
				String n4 = t2.getText();
				
				int n33 = Integer.parseInt(n3);
				int n44 = Integer.parseInt(n4);
				
				JOptionPane.showMessageDialog(f, n44 - n33);
				
				
			}
		});
		minus.setBackground(new Color(193, 193, 255));
		minus.setBounds(131, 226, 97, 23);
		f.getContentPane().add(minus);
		
		JButton btnNewButton_1_1 = new JButton("*");
		btnNewButton_1_1.setBackground(new Color(193, 193, 255));
		btnNewButton_1_1.setBounds(240, 226, 97, 23);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}
}
