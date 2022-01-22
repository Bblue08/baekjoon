package decem29;

import java.util.Scanner;

public class test11021 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		for(int i =1; i<=a;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int c= A+B;
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+c);
		}	
	}
}
