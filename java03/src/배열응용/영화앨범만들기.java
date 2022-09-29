package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {

	
	
		// 전체영역에서 특정한 변수를 사용하려면 여기다 적어야함
	  	//클래스 아래에 선언해야함
		 static int start =2; // 전역변수
		 
	public static void main(String[] args) {
		// 영화제목
		String[] title = {"알라딘","모가디슈","공조2","탑건","헤어질결심"};
		//영화포스터파일
		String[] img = {"알라딘.png","모가디슈.png","공조2.png","탑건.png","헤어질결심.png"};
		//평점
		double[] jumsu = {9.42, 8.67, 8.03, 9.60, 8.95};
		
		JFrame f = new  JFrame();
		f.getContentPane().setBackground(new Color(55, 77, 40));
		f.getContentPane().setForeground(new Color(55, 77, 40));
		f.setSize(480, 450);
		
		JLabel top = new JLabel("공조2");
		top.setBackground(new Color(55, 77, 40));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("나눔스퀘어 Bold", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(new ImageIcon("C:\\Users\\kang6613\\Desktop\\java\\java03\\공조2.png"));
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("8.03점");
		under.setBackground(new Color(55, 77, 40));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("나눔스퀘어 Bold", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("◁");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (start > 0) {
					start = start -1;
					
					top.setText(title[start]);
					under.setText(jumsu[start]+"점");
					
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} 
				else {
					JOptionPane.showMessageDialog(f, "끝입니다.");
				}
				
				
				//점 안 넣었을 때 에러난 이유 : settext는 string만 쓸 수 있다
				//점 안 넣으면 double 상태이기 때문에 에러가 나타난것
				//점 글자 하나 넣으면 string으로 변하기 때문에 오류가 생기지 않았다.
				//제목이 표시된 라벨이 변경되야함
			}
			
		});
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("▷");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (start<5) {
				
				start = start + 1;
				top.setText(title[start]);
				under.setText(jumsu[start]+"점");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "끝입니다.");
				}
					
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
	}

}
