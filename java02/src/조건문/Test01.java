package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		
		String pw = JOptionPane.showInputDialog("암호 입력");
		
		if (pw.equals("pass")) {
		System.out.println("들어오세요");
		} else {
			System.out.println("나가세요");
		}

	}

}
