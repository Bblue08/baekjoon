import java.util.*;
public class test2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a;i++) {
			System.out.println("*".repeat(i));
		}
		
		/*
		 for(int i=1; i<=a;i++) {
		 	for(int k=1;k<=i;k++){
		 		System.out.print("*");
		 	}
			System.out.println(" ");
		} 
		k가 i보다 작을 때마다 *이 실행되니까 행의 개수만큼 별이 출력됨
		별출력시 println사용하면 안되고 이후 *출력실행이 끝나면 줄 바꾸어주어야함
		 */
		
	}
}
