import java.util.*;
public class test1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int e=a; // 놓친 포인트 
		int i =0; // true 라 기본으로 1번 실행, 0으로 실행
		
		while(true) {
			e=((e%10)*10)+(((e%10)+(e/10))%10); // 여기서 a라고 생각하기 쉽지 않네
			i++;
			
		if(a==e) {break;}
		}
		System.out.print(i);
		
	}

}
/*
 * 식을 한줄로 나타내는 것 
 * a!=e라면 다시 돌아가서 실행하는 것 
 * "실제로는 반복문에서 a값을 새로운 값으로 대채헤주는 것임을 생각해보아야함"
 * a는 키보드에서 입력받은 값이니 이 값을 옆에 옮겨두고 복사해서 비교하는 의미
 * 꼭 계산식이 하나여야함
 * 
 */
