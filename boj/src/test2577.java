import java.util.*;
public class test2577 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d = a*b*c;
		
		String temp=Integer.toString(d);
		int arr[] = new int[10];
		char tmp=' ';
		
		for(int i=0;i<temp.length();i++) {
			tmp=temp.charAt(i);
			
			for(int j=0;j<arr.length;j++) {
				if((tmp-'0')==j) {arr[j]+=1;}
			}
		}
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
/*
 * for(int i=0; i<temp.length();i++) {
			
		}
 * 
 * https://pridiot.tistory.com/47
 * length()�� string���� ���� ���� , ��ȣ �پ�ٴ� ����
 * Integer.tostring()�� ��ȣ�� ���̳� ����(int)�� string ��ȯ�ؼ� ������
 * .charAt()�� string���� ����� ���ڿ� �� �� ���ڸ� �����ؼ� char Ÿ������ ��ȯ����
 * 			scanner�� ���� char�� ����ϱ� ���� �ַ� ����
 * 
 */
