package mijin.std_mijin.y_2022.sep_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*애너그램 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	5363	2613	2272	51.160%
문제
두 단어 A와 B가 주어졌을 때, A에 속하는 알파벳의 순서를 바꾸어서 B를 만들 수 있다면, A와 B를 애너그램이라고 한다.

두 단어가 애너그램인지 아닌지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수(<100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 100을 넘지 않는 단어가 공백으로 구분되어서 주어진다. 단어는 알파벳 소문자로만 이루어져 있다.

출력
각 테스트 케이스마다 애너그램인지 아닌지를 예체 출력과 같은 형식으로 출력한다. 

출력 형식
정확한 출력 형식은 제출에서 언어를 Java로 설정하면 확인할 수 있다.

예제 입력 1 
3
blather reblath
maryland landam
bizarre brazier
예제 출력 1 
blather & reblath are anagrams.
maryland & landam are NOT anagrams.
bizarre & brazier are anagrams.*/
public class bj_6996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcase = Integer.parseInt(br.readLine()); //케이스
		//알파벳 인덱스
		int[] Abal = new int [26];
		int[] Bbal = new int [26];
		StringTokenizer st ;
		
		for(int i=0;i<tcase;i++) {
			st = new StringTokenizer(br.readLine()); //알파벳 입력
			String a= st.nextToken();
			String b= st.nextToken();
			
			clear(Abal);
			clear(Bbal);
			//글자수가 다를경우 pass
			if(a.length() != b.length()) {
				System.out.println(a +" & "+ b + " are NOT anagrams.");
				continue;
			}
			
			for(int k =0;k<a.length();k++) {
				Abal[a.charAt(k)-97]++;
				Bbal[b.charAt(k)-97]++;
			}
			//최종비교
			for(int k=0;k<a.length();k++) {
				if(Abal[k]!=Bbal[k]) {
					System.out.println(a +" & "+ b + " are NOT anagrams.");
					continue;
				}
			}
			
			System.out.println(a +" & "+ b + " are anagrams.");
			
		}
		
	}
	
	public static void clear(int [] arr) {
		for(int i=0;i<arr.length;i++)
			arr[i] =0;
	}

}
