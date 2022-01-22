import java.util.*;
public class test1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((double)(a/b));
	} // 이렇게 따로 print에 double이라고 걸어주어야 한다. 

}
// float의 오차 정도는 10-7승 정도 
// double 의 오차 정도는 10^-15정도
// 문제에서는 10^-9 이므로 용납되는 오차는 double이다. 
