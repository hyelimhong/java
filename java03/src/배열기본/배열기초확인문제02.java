package 배열기본;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class 배열기초확인문제02 {

	public static void main(String[] args) {
		String[] place = {"제주도","부산","일본","미국","유럽"};
		
		for (String x : place) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int i = 0; i < place.length; i++) {
			System.out.print(place[i] + " ");
		}
		
		char[] color = {'r', 'g', 'p','y','b'};
		
		
		System.out.println();
		for (int i = 0; i < place.length; i++) {
			System.out.print(color[i] + " ");
		}
		for (char c : color) {
			System.out.print(c + " ");
		}
		
		
		double[] s1 = new double[5];
		
		
		


	}

}
