import java.util.*;
public class test2577 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d = a*b*c;
		
		String temp=Integer.toString(d);
		int arr[] = new int[10];
		char tmp=' ';
		
		for(int i=0;i<temp.length();i++) {
			tmp=temp.charAt(i);
			
			for(int j=0;j<arr.length;j++) {
				if((tmp-'0')==j) {arr[j]+=1;}
			}
		}
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
/*
 * for(int i=0; i<temp.length();i++) {
			
		}
 * 
 * https://pridiot.tistory.com/47
 * length()는 string전용 길이 측정 , 괄호 붙어다님 조심
 * Integer.tostring()는 괄호안 값이나 변수(int)를 string 변환해서 저장함
 * .charAt()은 string으로 저장된 문자열 중 한 글자만 선택해서 char 타입으로 변환해줌
 * 			scanner를 통해 char를 사용하기 위해 주로 사용됨
 * 
 */
