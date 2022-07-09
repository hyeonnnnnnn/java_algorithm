package sohyeon.jun25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://github.com/PaengE/AlgorithmPractice/blob/master/BaekJoon_java/src/BOJ2929.java
//https://aorica.tistory.com/187?category=835561
/*
 * 문제
종수는 새 마이크로프로세서를 구매했다. 새 프로세서에 예전 프로세서에서 작동하던 프로그램을 실행시키니 실행이 되지 않았다.

며칠동안 두 프로세서의 기술 문서를 살펴본 결과, 그 결과를 알게 되었다. 새 프로세서의 실행 속도를 향상시키기 위해서 프로그램 머신 코드에 제한이 새로 생겼다.

예전 프로세서에서는 제한이 없었다.

프로세서의 머신 코드는 명령을 실행할 순서대로 나열한 것이다. 각 명령은 메모리를 1바이트 사용한다.

또, 명령은 0개 또는 그 이상의 파라미터를 가질 수 있으며, 각 파라미터도 1바이트씩 메모리를 차지한다. 머신 코드에서 파라미터는 명령의 바로 뒤에 따라 나온다.

머신 코드를 명령은 대문자, 파라미터는 소문자로 나타낼 수 있다.

위의 프로그램은 명령 4개로 이루어져 있다. 첫 번째 명령은 파라미터 3개, 두 번째는 2개, 세 번째는 파라미터가 없고, 네 번째는 4개이다. 이 프로그램은 메모리를 13바이트 사용한다.

새 프로세서는 메모리를 4바이트 단위로 가져온다. 즉, 명령은 반드시 4로 나누어지는 위치에서 시작해야 한다.

(메모리의 첫 바이트가 주소 0) 따라서, 새로운 명령 NOP(no operation)를 추가해 모든 명령이 시작하는 위치를 4로 나누어지는 곳으로 맞춰야 한다.

위의 프로그램을 새 프로세서용으로 변환한 머신 코드는 아래와 같다.

명령 A, B, C, D의 시작 위치는 0, 4, 8, 12로 모두 4로 나누어 떨어진다.

예전 프로세서의 머신 코드가 주어졌을 때, 새 프로세서에서 실행시키기 위해 삽입해야 하는 NOP 개수의 최솟값을 구하는 프로그램을 작성하시오.
--
입력
예전 프로세서용 머신 코드 프로그램이 주어진다. 프로그램은 최대 200글자로 이루어져 있다.

프로그램은 항상 명령으로 시작한다. (첫 글자가 대문자) 한 명령이 머신 코드에서 여러 번 나오는 경우에, 항상 같은 개수의 파라미터를 갖는다.
--
출력
삽입해야하는 NOP 개수의 최솟값을 출력한다.
--
예제 입력 1 
Abcd
예제 출력 1 
0
--
예제 입력 2 
EaEbFabG
예제 출력 2 
5
--
예제 입력 3 
AbcbBccCDefgh
예제 출력 3 
4
*/

public class No1_2929 {

	static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		String regex = "([A-Z][a-z]*)";
		Pattern pattern = Pattern.compile(regex);							// 주어진 정규식을 갖는 패턴을 생성
		int NOPcnt = 0, start;
		
		str = br.readLine();
		Matcher matcher = pattern.matcher(str);								// 패턴에 매칭할 문자열을 입력해 Matcher를 생성

		while (matcher.find()) {
			start = matcher.start();										// matcher.find()를 통해 찾은 시작 지점 index 값을 반환
			start += NOPcnt;

			if (start % 4 != 0) {
				NOPcnt += 4 - start % 4;
			}
		}
		bw.write(NOPcnt + "");
		bw.flush();
	}

}
