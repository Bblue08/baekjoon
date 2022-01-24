import java.util.*;
public class test2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		String fin="";
		
		//전체 테스트 개수만큼 반복함
		for(int i=0;i<a;i++) {
			int b= sc.nextInt();
			String c= sc.next(); // 꼭 next로 받아들여야함
			
			//문자열의 길이만큼 쪼개야지 문자열의 모든 문자를 건드릴 수 있음
			for(int j=0; j<c.length();j++) {
				
				// 문자열의 문자를 쪼개서 b번만큼 반복해서 출력하기 위함
				for(int k=0; k<b;k++) {
					System.out.print(c.charAt(j));
				}
			}
			//개행
			//행을 열어주지 않으면 위 결과 뒤에 바로 이어서 다음 테스트를 입력해야함
			System.out.println();
		}
	}

}

/*
 * 문자열은 .repeat로 반복할 수 있는데 문자에는 해당이 되지 않아서 for문을 두번사용해야했음
 * Scanner로 입력받을때 nextLine이 아닌 next로 입력받아야한다. line은 공백까지 한 문자로 처리함
 */
