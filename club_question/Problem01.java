package club_question;

import java.util.Arrays;
import java.util.Scanner;

public class Problem01 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt(); 
		int b[] = {500, 100, 50, 10}; 
		int a[] = new int[4];
		for(int i = 0; i < b.length; i++) {
			a[i] = fir / b[i];
			fir %= b[i];
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
