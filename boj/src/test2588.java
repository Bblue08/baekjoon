import java.util.*;
public class test2588 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		
		System.out.println(b%10*a);
		System.out.println(((b/10)%10)*a);
		System.out.println(((b/10)/10)*a);
		System.out.println(b*a);

	}

}
