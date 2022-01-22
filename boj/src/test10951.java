import java.util.Scanner;
public class test10951 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		
		while(sc.hasNextInt()) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			System.out.println(a+b);

		}

	}

}
/*
 scanner가 차례까 되었는데 아무것도 들어오지 않으면 EOF가 발생되므로 NoSuchElementException오류발생
추가로 입력해주어야함
이처럼 종료타이밍을 신경써야함

그리고 스캐너가 읽어오는 위치도 중요함

 */
