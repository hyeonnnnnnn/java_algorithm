package sohyeon.mar05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 문제
해류가 매우 느리고 바닥을 기어다니는 생물이 적은 바다 밑바닥에서만 발견되는 잔물결 무늬의 정체는 오랫동안 해양학자들에게 수수께끼였다.

하지만 최근의 연구 성과는 동물 언어학 분야에 일대 혁명을 불러왔다. 이 무늬의 정체는 바로 문어가 숫자를 적는 방법이라는 것이 해양 생물학자들에 의해 밝혀진 것이다.

학자들은 문어가 무엇을 세는 것인지는 아직 알 수 없지만, 수 표기법을 해독하는 데에는 성공했다.

뭍 위에 사는 이들에게는 문어가 쓰는 숫자와 그를 표현하는 잔물결 무늬가 매우 낯설 수밖에 없다. 따라서 연구자들은 다음과 같은 기호로 잔물결 무늬를 적기로 합의했다.

각 기호와 대응하는 숫자는 다음과 같다.

-는 0에 대응한다.
\는 1에 대응한다.
(는 2에 대응한다.
@는 3에 대응한다.
?는 4에 대응한다.
>는 5에 대응한다.
&는 6에 대응한다.
%는 7에 대응한다.
/는 -1에 대응한다.

해양 신경학자들은 특히 음수를 나타내는 기호가 있다는 사실에 흥분하면서, 아직 걸음마 단계인 두족류 신경학이 이 발견을 계기로 크게 발전하기를 기대하고 있다.

당연히 문어의 수 체계는 8진법에 기반한다. 예를 들면 다음과 같다.

(@&는 2 × 82 + 3 × 8 + 6 = 158이다.

?/--는 4 × 83 + -1 × 82 + 0 × 8 + 0 = 1984이다.
/(\는 -1 × 82 + 2 × 8 + 1 = -47이다.

당신에게 주어진 문제는 문어 숫자를 입력 받아 십진수로 나타내는 것이다.
--
입력
한 줄에 하나씩 문어 숫자가 입력으로 주어진다. 각 숫자는 최소 한 개, 최대 여덟 개의 문어 숫자 기호로 이루어져있다. 입력으로 '#'이 들어오면 입력을 종료한다.
--
출력
입력 받은 문어 숫자에 대응하는 십진수를 한 줄에 하나씩 출력한다.
--
예제 입력 1 
(@&
?/--
/(\
?
#
예제 출력 1 
158
1984
-47
4

*/

public class No2_1864 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// read
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		// write
        
        int cnt = 0;
        int sum = 0;
        
        while(true) {
        	
            String input = br.readLine();			// 한줄로 읽어와서
            
            if(input.equals("#")) {		// # 입력 시 종료
                break;
            }
            
            else {
            	
                for(int i = 0; i < input.length(); i++) {
                	
                    int tmp = 0;
                    
                    switch(input.charAt(i)) {			// 각 문자에 일치하는것 찾아서
                        case '-': tmp = 0; break;
                        case '\\': tmp = 1; break;
                        case '(': tmp = 2; break;
                        case '@': tmp = 3; break;
                        case '?': tmp = 4; break;
                        case '>': tmp = 5; break;
                        case '&': tmp = 6; break;
                        case '%': tmp = 7; break;
                        case '/': tmp = -1; 
                        
                    }
                    sum += tmp * Math.pow(8, input.length()-1-cnt);			// 8진수로 변형시켜서 누적
                    
                    cnt++;
                }
            }
            
            bw.write(sum + "\n");		// 결과 출력
            
            cnt=0;			// 초기화
            sum=0;			// 초기화
        }
        bw.flush();
        bw.close();


	}

}
