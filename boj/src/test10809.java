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
 indexOf는 괄호 안 문자를 왼쪽부터 탐색해나가서 몇번째에 있는 문자인지 알려준다
 왼쪽부터 탐색하며 찾는 값이 존재하지 않을 경우 -1을 출력한다. 

indexof르 사용하지 않는다면 26개 숫자 배열에 모두 -1을 채운다음(Arrays.fill)
s.length(i)-97을 사용해 a의 위치를 0으로 잡는다. 

for(int i=0; i<s.length();i++){
	if(arr[s.length(i)-97]=i{
	arr[s.length-97]=i}
	
로 풀 수 있다. 



 */
