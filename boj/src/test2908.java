import java.util.*;
public class test2908 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		int b=sc.nextInt();
		int reverse_a=0;
		int reverse_b=0;
		
		while(a!=0) {
			int digit_a =a%10;
			reverse_a=reverse_a*10+digit_a;
			a /=10;
		}
		
		while(b!=0) {
			int digit_b =b%10;
			reverse_b=reverse_b*10+digit_b;
			b /=10;
		}
		
		if(reverse_a - reverse_b>0) {
			System.out.println(reverse_a);
		}
		else {
			System.out.println(reverse_b);
		}
	}

}

/*
A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

append���� ���� int���� StringBuilder�� Ÿ�Ժ�ȯ
reverse����� ����� ���ڤӿ��� ������
StringBuilder�� �ٽ� toString�� ����� int�� �ٽ� Ÿ���� ��ȯ��Ŵ


System.out.print(A > B ? A : B);
*/