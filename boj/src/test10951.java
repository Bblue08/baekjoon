import java.util.Scanner;
public class test10951 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		
		while(sc.hasNextInt()) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println(a+b);

		}

	}

}
/*
 scanner�� ���ʱ� �Ǿ��µ� �ƹ��͵� ������ ������ EOF�� �߻��ǹǷ� NoSuchElementException�����߻�
�߰��� �Է����־����
��ó�� ����Ÿ�̹��� �Ű�����

�׸��� ��ĳ�ʰ� �о���� ��ġ�� �߿���

 */
