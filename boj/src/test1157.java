import java.util.*;
public class test1157 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		s=s.toUpperCase(); // ��ü�� �빮�ڷ� �ٲ����
		int arr[]= new int[26];
		Arrays.fill(arr, 0);
		
		for(char i='A';i<='Z';i++) {
			for(int j=0; j<s.length();j++) {
				if(i==s.charAt(j)) {
					arr[i-65]++;
				}
			}
		} 
		int Max=0;
		int index =0;
		for(int i=0; i<26;i++) {
			if(Max<arr[i]) {
				Max=arr[i];
				index=i;
			}
			else if(Max==arr[i]) {
				
				index=-2;
			}
		}
		char ch=(char)(index+65);
		System.out.println(ch);
	}
}

/*
 * �ҹ��� �빮�ڸ� �Ű��� �Ѵٸ� �Ʒ����� ������� �ҹ��ڿ� �빮�ڸ� �����ϴ� �͵� �����ϴ�. 
 * (���� ��¥�� ����� �빮���̱淡 �׳� �� �빮�ڷ� �ٲ����)
 
if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // �빮�� ����
arr[s.charAt(i) - 'A']++;	// �ش� �ε����� �� 1 ����
}

else {	// �ҹ��� ����
arr[s.charAt(i) - 'a']++;
}

*�ʱ⿡ �迭�� -1�� ä���µ�, ���ڰ� ���� �� +1�� �ɰ� max�� 0�� �ɾ������ ���� ==�� �Ѿ����

*Ȯ���� �Ẹ�ϱ� �ƽ�Ű�ڵ带 ��� ����ϴ��� �� �� ����. 
*�ƽ�Ű�ڵ�ǥ�� ���� ���� § �ڵ�� �ѵ��ϴ�. 
	�ٸ� ���ۿ��� ������ ã�ƺ��� �ڵ� �޸𸮰� �� ���� ũ�� �ð��� �� ����� �� �� ª�٤�
	

*/