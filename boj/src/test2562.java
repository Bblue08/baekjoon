import java.util.*;
public class test2562 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bae [] = new int[9];
		int max=bae[0]; // 내가 놓친 부분 초기값 설정해줌
		int maxindex = 0;
		
		for(int i=0;i<bae.length;i++) {
			bae[i] = sc.nextInt(); // 입력값받아서 배열에 넣음
			if(bae[i]>max) {
				max=bae[i]; // 최댓값 돌리고
				maxindex=i+1;} //아 인덱스 번호 신경 쓰라고~
		}
		System.out.println(max);
		System.out.println(maxindex);
	}

}
/*
위 import에서 util.scanner만 받으면 arrys사용 불가능
배열은 for문 안이 아니더라도 공유 가능
Arrays.binarySearch 는 정렬된 배열에만 사용가능함
인덱스도 같이 관리 // 인덱스 0부터 세는거 꼭 명심하기
뭔가 이상하면 입력 바꿔서 해보기
if괄호 안에 안넣고 뻘짓하고 있었음
*/