import java.util.*;
public class test10818 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int names[] = new int [a]; // 배열이 int인지 string인지 잘 파악하기
		
		for(int i =0;i<a;i++) {
			names[i]=sc.nextInt();
			
		}
		Arrays.sort(names); // 배열의 값을 오름차순으로 정렬해주는 메소드
		System.out.print(names[0]+" "+names[a-1]);
	}

}
 /* 배열을 사용하지 않고 구하고 싶다면
입력값의 최소범위로 최소.최대값을 설정하고
if(최소값>입력값) {입력값=최소값}

*/