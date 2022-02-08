import java.util.*;
public class test5622 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		
		char ch=' ';
		int tot=0;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			switch(ch) {
			case 'A':
			case 'B':
			case 'C':
				tot+=3;
				break;
				
			case 'D':
			case 'E':
			case 'F':
				tot+=4;
				break;
				
			case 'G':
			case 'H':
			case 'I':
				tot+=5;
				break;
				
			case 'J':
			case 'K':
			case 'L':
				tot+=6;
				break;
				
			case 'M':
			case 'N':
			case 'O':
				tot+=7;
				break;
				
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				tot+=8;
				break;
				
			case 'T':
			case 'U':
			case 'V':
				tot+=9;
				break;
				
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				tot+=10;
				break;
			}
		}
		System.out.println(tot);
		
		
	}

}
