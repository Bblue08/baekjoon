import java.util.*;
public class test4344 {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[]; // ������ �𸦶� �迭�� �ϴ� �����س���
		 
		for(int i =0; i<testcase;i++) {
			int student= sc.nextInt();
			arr = new int[student]; // ���� ���� ���� �������� �迭 �ʱ�ȭ	
			double sum=0; // ��¥�� ���ϸ� ������ �ڷ����� ����� ���µ� �ݵ�� �� ��ġ������ 
			// ���� ū for������ ����ؾ��ϴµ� �� for�� ������ ����ؾ��ϴ� �� ��ġ���� ��
			// �׷��ٸ� �� �ٱ� ū for ������ �����ϸ� �ȵǴ°�?
			for(int j=0; j<student;j++) {
				int scores=sc.nextInt();
				arr[j]=scores; // ������ �迭�� ����
				
				sum+=scores;
				
			}
			
			double average = sum/student; // ��� ���ڶ�� ���� int�� �ڷ��� �����ϸ� ���
			double count=0;
			
			for(int j=0; j<student;j++) {// if���� ���� ������ ����� count�� ������
				if(arr[j]>average) {
					count++;
				}
			}
		double tot = count/student*100;
		System.out.printf("%.3f%%\n",tot); // %�ΰ� �Է��ؾ� %���ڷ� ��°���
		
		}
		
	}
}


/*
 * scanner���� nextint�� ���� ������ �ڵ����� ������ ���ڸ� �޴´ٰ� �Ѵ�.
 * bufferedreader �� bufferreader�� �ٸ��ٰ� �Ѵ�. �ٸ� �Ѵ� ���ڸ� string �������� �޴µ��ϴ�.
 * buffer�� ����ϸ� stringtokenizer�� ���� ��Ʈó�� ����ٴϴµ�
 * �ε��� ���� �����ؾ��Ѵ�.
 * 
 *������ printf���� %f�� double���� �Ҽ����� �ǹ� , �׷��� ������� ���ϴ� ���� ��� int�� �Ǿ��ִٸ� ������ ��
 *������� ���� double�� ����������
 */
