import java.util.*;
public class test2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		String fin="";
		
		//��ü �׽�Ʈ ������ŭ �ݺ���
		for(int i=0;i<a;i++) {
			int b= sc.nextInt();
			String c= sc.next(); // �� next�� �޾Ƶ鿩����
			
			//���ڿ��� ���̸�ŭ �ɰ����� ���ڿ��� ��� ���ڸ� �ǵ帱 �� ����
			for(int j=0; j<c.length();j++) {
				
				// ���ڿ��� ���ڸ� �ɰ��� b����ŭ �ݺ��ؼ� ����ϱ� ����
				for(int k=0; k<b;k++) {
					System.out.print(c.charAt(j));
				}
			}
			//����
			//���� �������� ������ �� ��� �ڿ� �ٷ� �̾ ���� �׽�Ʈ�� �Է��ؾ���
			System.out.println();
		}
	}

}

/*
 * ���ڿ��� .repeat�� �ݺ��� �� �ִµ� ���ڿ��� �ش��� ���� �ʾƼ� for���� �ι�����ؾ�����
 * Scanner�� �Է¹����� nextLine�� �ƴ� next�� �Է¹޾ƾ��Ѵ�. line�� ������� �� ���ڷ� ó����
 */
