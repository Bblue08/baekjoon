import java.util.*;
public class test2562 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bae [] = new int[9];
		int max=bae[0]; // ���� ��ģ �κ� �ʱⰪ ��������
		int maxindex = 0;
		
		for(int i=0;i<bae.length;i++) {
			bae[i] = sc.nextInt(); // �Է°��޾Ƽ� �迭�� ����
			if(bae[i]>max) {
				max=bae[i]; // �ִ� ������
				maxindex=i+1;} //�� �ε��� ��ȣ �Ű� �����~
		}
		System.out.println(max);
		System.out.println(maxindex);
	}

}
/*
�� import���� util.scanner�� ������ arrys��� �Ұ���
�迭�� for�� ���� �ƴϴ��� ���� ����
Arrays.binarySearch �� ���ĵ� �迭���� ��밡����
�ε����� ���� ���� // �ε��� 0���� ���°� �� ����ϱ�
���� �̻��ϸ� �Է� �ٲ㼭 �غ���
if��ȣ �ȿ� �ȳְ� �����ϰ� �־���
*/