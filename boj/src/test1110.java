import java.util.*;
public class test1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int e=a; // ��ģ ����Ʈ 
		int i =0; // true �� �⺻���� 1�� ����, 0���� ����
		
		while(true) {
			e=((e%10)*10)+(((e%10)+(e/10))%10); // ���⼭ a��� �����ϱ� ���� �ʳ�
			i++;
			
		if(a==e) {break;}
		}
		System.out.print(i);
		
	}

}
/*
 * ���� ���ٷ� ��Ÿ���� �� 
 * a!=e��� �ٽ� ���ư��� �����ϴ� �� 
 * "�����δ� �ݺ������� a���� ���ο� ������ ��ä���ִ� ������ �����غ��ƾ���"
 * a�� Ű���忡�� �Է¹��� ���̴� �� ���� ���� �Űܵΰ� �����ؼ� ���ϴ� �ǹ�
 * �� ������ �ϳ�������
 * 
 */
