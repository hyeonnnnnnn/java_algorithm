package sohyeon.aug27;

import java.util.Arrays;
import java.util.Scanner;

/*문제
두 단어 A와 B가 주어졌을 때, A에 속하는 알파벳의 순서를 바꾸어서 B를 만들 수 있다면, A와 B를 애너그램이라고 한다.

두 단어가 애너그램인지 아닌지 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 테스트 케이스의 개수(<100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 100을 넘지 않는 단어가 공백으로 구분되어서 주어진다. 

단어는 알파벳 소문자로만 이루어져 있다.
--
출력
각 테스트 케이스마다 애너그램인지 아닌지를 예체 출력과 같은 형식으로 출력한다. 
--
출력 형식
정확한 출력 형식은 제출에서 언어를 Java로 설정하면 확인할 수 있다.
--
예제 입력 1 
3
blather reblath
maryland landam
bizarre brazier
예제 출력 1 
blather & reblath are anagrams.
maryland & landam are NOT anagrams.
bizarre & brazier are anagrams.
*/
public class No2_6996 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();													// 테스트케이스 개수
		
		char[] ch1 = new char[T];												// 단어A 문자 저장할 배열
	    char[] ch2 = new char[T];												// 단어B 문자 저장할 배열
	    
		for(int i = 0; i < T; i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			ch1 = str1.toCharArray();											// 문자열 배열로 변환
			ch2 = str1.toCharArray();
			
			Arrays.sort(ch1);													// 글자 순서대로 각 배열 정렬
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {										// 배열 비교 -> 일치
				System.out.println(str1+ " & " +str2+ " are anagrams.");
				
			} else {															// 배열 비교 -> 불일치
		    	System.out.println(str1+ " & " +str2+ " are NOT anagrams.");
		    	
		    }
		}
		
		sc.close();
	}

}
