import java.util.*;
public class test10952 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		while(true) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			if(a!=0 && b!=0) {
				System.out.println(a+b);
			}
			if(a==0&&b==0) {
				break;
			}
		}

	}

}
/* while(조건식){
 * break는 식 끝내기
 * continue는 조건식으로 돌아가기
 *  
 */
