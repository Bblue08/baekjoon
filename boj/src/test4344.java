import java.util.*;
public class test4344 {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[]; // 개수를 모를땐 배열만 일단 선언해놓기
		 
		for(int i =0; i<testcase;i++) {
			int student= sc.nextInt();
			arr = new int[student]; // 위에 얻은 수를 바탕으로 배열 초기화	
			double sum=0; // 어짜피 더하면 정수라 자료형은 상관은 없는데 반드시 이 위치여야함 
			// 같은 큰 for문에서 사용해야하는데 밑 for문 에서도 사용해야하니 이 위치여야 함
			// 그렇다면 왜 바깥 큰 for 문에서 지정하면 안되는가?
			for(int j=0; j<student;j++) {
				int scores=sc.nextInt();
				arr[j]=scores; // 점수만 배열에 저장
				
				sum+=scores;
				
			}
			
			double average = sum/student; // 평균 숫자라고 전부 int로 자료형 지정하면 곤란
			double count=0;
			
			for(int j=0; j<student;j++) {// if문을 따로 만들어야 제대로 count가 세어짐
				if(arr[j]>average) {
					count++;
				}
			}
		double tot = count/student*100;
		System.out.printf("%.3f%%\n",tot); // %두개 입력해야 %문자로 출력가능
		
		}
		
	}
}


/*
 * scanner에서 nextint를 통해 공백을 자동으로 구분해 문자를 받는다고 한다.
 * bufferedreader 와 bufferreader는 다르다고 한다. 다만 둘다 문자를 string 형식으로 받는듯하다.
 * buffer를 사용하면 stringtokenizer는 거의 세트처럼 따라다니는듯
 * 인덱스 수에 주의해야한다.
 * 
 *마지막 printf에서 %f는 double같은 소숫값을 의미 , 그런데 결과값을 구하는 식이 모두 int로 되어있다면 오류가 남
 *상관없는 것을 double로 지정해주자
 */
