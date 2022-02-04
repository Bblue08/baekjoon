import java.util.*;
public class test1152 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String s= sc.nextLine();
		// 문자열 앞 뒤 공백 제거 
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
공백한칸이 단어 한개로 인식된다는 문제점 때문에 1번 실패
공백으로 나눈값을 저장하고 count를 하면 공백도 1로 인식됨
공백인지 먼저 인식하고 공백은 쪼개지 않고 
	공백이 아니라면 split 메소드 사용

		
		

*/

/*
 * 처음 시도했던 식	
		int c= arr.length;
		
		if(s==" ") {
			
		}
		
		System.out.println(c);
*/

/*
 * 방법2
 *System.out.println(s.split(" ").length);
*/