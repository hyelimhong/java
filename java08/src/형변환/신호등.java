package 형변환;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 신호등 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 0, 0));
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_2 = new JButton("빨간신호");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel img = new JLabel();
				
				ImageIcon icon = new ImageIcon("r.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 128, 128));
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("노랑신호");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("y.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 128));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("파랑신호");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("g.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 255));
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);

	}

}
