import java.util.*;
public class test11720 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		String b=sc.next();
		String[] sarr= b.split("");
		int[] nums = Arrays.stream(sarr).mapToInt(Integer::parseInt).toArray();
		
		int sum=0;
		for(int i=0; i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}

}
/*
 * sum += a.charAt(i)-'0'; // charAt은 아스키코드 값을 반환하므로 반드시 -48이나 -'0'을 해주어야한다. 
 */