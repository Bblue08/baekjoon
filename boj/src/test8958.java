import java.util.*;
public class test8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		String arr[]= new String[a];
		
		for(int i =0; i<a;i++) {
			String b=sc.next();
			arr[i]=b;
				
		}
		
		
		for(int i =0; i<a;i++) {
			
			int cnt =0; //����Ƚ�� // ���⼭ ����Ʈ ��ħ
			int sum =0; // ����Ȯ�� ��
			
			for(int j=0; j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O'){cnt++;} // ���⼭ �ֵ���ǥ ����ϸ� ����
				else {cnt=0;}
				sum+=cnt; // ��ġ����
			}
		
		System.out.println(sum);
		}
		
		
	}

}
// �ֵ���ǥ�� ���ڿ�
//����ǥ�� char ���Ϲ���
//charAt�� ���ֻ���ϴϱ� ���ӻ� ����صα�