import java.util.*;
public class test3052 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i =0; i<10;i++) {
			int a= sc.nextInt();
			int b = a%42;
			arr[i]=b; // �迭�� i��°�� �ش� ������ �����ϱ�
		}
		
		Set<Integer> set = new HashSet<>();
		for(int loop : arr) {
			set.add(loop);
		}
		int c = set.size();
		System.out.println(c);
		
		

	}
	
}
//set�� �ߺ��� ����� ���� �� ��� set�� �����ϰ� ������ �ڵ����� �ߺ��� ���ܵǰ� ����ȴٰ� �Ѵ�.
// set�� ���̸� ���Ҷ� size�� ǥ�õǳ�����
//
/*
 �ڷ����� �ٲٴ°� �ƴ϶� �ڷ����� �ٲ۴ٴ� ���� �������ϱ�
 length�� ��ȣ ������ ����
*/