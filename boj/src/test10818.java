import java.util.*;
public class test10818 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int names[] = new int [a]; // �迭�� int���� string���� �� �ľ��ϱ�
		
		for(int i =0;i<a;i++) {
			names[i]=sc.nextInt();
			
		}
		Arrays.sort(names); // �迭�� ���� ������������ �������ִ� �޼ҵ�
		System.out.print(names[0]+" "+names[a-1]);
	}

}
 /* �迭�� ������� �ʰ� ���ϰ� �ʹٸ�
�Է°��� �ּҹ����� �ּ�.�ִ밪�� �����ϰ�
if(�ּҰ�>�Է°�) {�Է°�=�ּҰ�}

*/