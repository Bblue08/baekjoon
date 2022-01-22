import java.util.*;
public class test8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		String arr[]= new String[a];
		
		for(int i =0; i<a;i++) {
			String b=sc.next();
			arr[i]=b;
				
		}
		
		
		for(int i =0; i<a;i++) {
			
			int cnt =0; //연속횟수 // 여기서 포인트 놓침
			int sum =0; // 누적확산 값
			
			for(int j=0; j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O'){cnt++;} // 여기서 쌍따옴표 사용하면 에려
				else {cnt=0;}
				sum+=cnt; // 위치조심
			}
		
		System.out.println(sum);
		}
		
		
	}

}
// 쌍따옴표는 문자열
//따옴표는 char 단일문자
//charAt은 자주사용하니까 쓰임새 기억해두기