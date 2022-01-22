import java.util.*;
public class test10871 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int c= sc.nextInt();
			if (c<X) {
				System.out.print(c);
				System.out.print(" ");
			}
			
		}

	}

}
