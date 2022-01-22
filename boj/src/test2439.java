import java.util.*;
public class test2439 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int k=a;k>i;k--) {
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//for문 구현에서 꽤나 애 먹은 문제 오른쪽 배열과 for문의 구현에서 헷갈리는게 많았다. 
