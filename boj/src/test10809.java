import java.util.*;
public class test10809 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		
		for(char i='a';i<='z';i++) {
			System.out.print(s.indexOf(i)+" ");
		}
	}
}
/*
 indexOf�� ��ȣ �� ���ڸ� ���ʺ��� Ž���س����� ���°�� �ִ� �������� �˷��ش�
 ���ʺ��� Ž���ϸ� ã�� ���� �������� ���� ��� -1�� ����Ѵ�. 

indexof�� ������� �ʴ´ٸ� 26�� ���� �迭�� ��� -1�� ä�����(Arrays.fill)
s.length(i)-97�� ����� a�� ��ġ�� 0���� ��´�. 

for(int i=0; i<s.length();i++){
	if(arr[s.length(i)-97]=i{
	arr[s.length-97]=i}
	
�� Ǯ �� �ִ�. 



 */
