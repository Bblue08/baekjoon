import java.util.*;
public class test1546 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double arr[] =new double  [sc.nextInt()];
		double sum=0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}// ������ �μ� ä���
		
		double Max=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>Max) {
				Max=arr[i];
			}
		}
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i]/Max*100;
		}
		
		System.out.println(sum/arr.length);
	}
}

/*
 import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double arr[] =new double  [sc.nextInt()];
		double sum=0;
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}// ������ �μ� ä���
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i]/arr[arr.length-1]*100;
		}
		System.out.println(sum/arr.length);
	}
}
 */
