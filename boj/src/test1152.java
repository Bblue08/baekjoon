import java.util.*;
public class test1152 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String s= sc.nextLine();
		// ���ڿ� �� �� ���� ���� 
		s=s.trim();
		
		if(s.isEmpty()) {
			System.out.println(0);
		}
		
			
		
		else {
			
			StringTokenizer st= new StringTokenizer(s, " ");
		System.out.println(st.countTokens());
		}
	}

}


/*
������ĭ�� �ܾ� �Ѱ��� �νĵȴٴ� ������ ������ 1�� ����
�������� �������� �����ϰ� count�� �ϸ� ���鵵 1�� �νĵ�
�������� ���� �ν��ϰ� ������ �ɰ��� �ʰ� 
	������ �ƴ϶�� split �޼ҵ� ���

		
		
System.out.println(s.split(" ").length);
*/

/*
 * ó�� �õ��ߴ� ��
 * 
 *
	
		
		int c= arr.length;
		
		if(s==" ") {
			c=0;
		}
		
		System.out.println(c);
*/