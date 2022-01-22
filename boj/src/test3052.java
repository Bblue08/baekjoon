import java.util.*;
public class test3052 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i =0; i<10;i++) {
			int a= sc.nextInt();
			int b = a%42;
			arr[i]=b; // 배열의 i번째에 해당 나머지 저장하기
		}
		
		Set<Integer> set = new HashSet<>();
		for(int loop : arr) {
			set.add(loop);
		}
		int c = set.size();
		System.out.println(c);
		
		

	}
	
}
//set은 중복된 결과를 받을 수 없어서 set에 저장하고 돌리면 자동으로 중복이 제외되고 저장된다고 한다.
// set은 길이를 구할때 size로 표시되나보다
//
/*
 자료형을 바꾸는게 아니라 자료형을 바꾼다는 말이 무슨말일까
 length에 괄호 유무는 뭐지
*/