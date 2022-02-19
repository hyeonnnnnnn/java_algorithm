package mijin.std_sh;

import java.util.Scanner;

/*
 * 문제
8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
--
첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
--
첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
--
예제 입력 1 
314
예제 출력 1 
11001100
*/
public class No3_1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
//		System.out.println(str.length());
		
		StringBuilder sb = new StringBuilder();
		
		if(str.length() <= 333334) {
			for (int i = 0; i < str.length(); i++) {
	        	
	            char c = str.charAt(i);		// i번째 글자를 가져옴
	            
	            switch (c){
	                case '0': sb.append("000"); break;
	                case '1': sb.append("001"); break;
	                case '2': sb.append("010"); break;
	                case '3': sb.append("011"); break;
	                case '4': sb.append("100"); break;
	                case '5': sb.append("101"); break;
	                case '6': sb.append("110"); break;
	                case '7': sb.append("111"); break;
	            }
	            
	        }
	        
	        if (sb.charAt(0)=='0') {	sb.deleteCharAt(0);		}		// 문자의 제일 앞자리가 0일 시 해당 문자열 삭제
	        if (sb.charAt(0)=='0') {	sb.deleteCharAt(0);		}
	        
	        System.out.println(sb);
	        
		} else {
			System.out.println("입력 길이 333334 초과");
		}
        
        
        sc.close();
	}
	

}
