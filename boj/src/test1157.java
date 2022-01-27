import java.util.*;
public class test1157 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		s=s.toUpperCase(); // 전체를 대문자로 바꿔버림
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
 * 소문자 대문자를 신경써야 한다면 아래같은 방법으로 소문자와 대문자를 구분하는 것도 가능하다. 
 * (나는 어짜피 출력은 대문자이길래 그냥 다 대문자로 바꿔버림)
 
if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
arr[s.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
}

else {	// 소문자 범위
arr[s.charAt(i) - 'a']++;
}

*초기에 배열을 -1로 채웠는데, 문자가 있을 때 +1을 걸고 max를 0을 걸어놨더니 전부 ==로 넘어가더라

*확실히 써보니까 아스키코드를 어떻게 사용하는지 알 것 같다. 
*아스키코드표만 보고 내가 짠 코드라 뿌듯하다. 
	다만 구글에서 정답을 찾아보니 코드 메모리가 더 많이 크고 시간은 내 방법이 좀 더 짧다ㅎ
	

*/