package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 문제
창영이는 매일 밤 하루동안 일어난 일을 일기장에 남긴다. 일기장을 쓰면서 영어 공부도 같이 하기 위해서 영어로 일기를 쓴다.

또, 남들이 자신의 일기장을 보는 것을 막기 위해서 모음('a','e','i','o','u')의 다음에 'p'를 하나 쓰고,  그 모음을 하나 더 쓴다.

예를 들어, "kemija" 는 "kepemipijapa"가 되고, "paprika"는 "papapripikapa"가 된다.

창영이가 일기장에 작성한 문장이 하나 주어졌을 때, 원래 문장은 무엇인지 구하는 프로그램을 작성하시오.
--
입력
첫째 줄에 알파벳 소문자와 공백으로만 이루어진 문장이 하나 주어진다. 모든 단어는 공백 하나로 구분되어져 있다. 문장의 길이는 최대 100이다.
--
출력
첫째 줄에 창영이가 일기장에 작성한 문장을 원래 문장으로 바꾸어 출력한다.
--
예제 입력 1 
zepelepenapa papapripikapa
예제 출력 1 
zelena paprika
--
예제 입력 2 
bapas jepe doposapadnapa opovapa kepemipijapa 
예제 출력 2 
bas je dosadna ova kemija
*/
public class No3_2954 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();												// 문장 입력받음
		
		str = str.replaceAll("apa", "a")
				 .replaceAll("epe", "e")
				 .replaceAll("ipi", "i")
				 .replaceAll("opo", "o")
				 .replaceAll("upu", "u");
		
		System.out.println(str);
		
	}

}
