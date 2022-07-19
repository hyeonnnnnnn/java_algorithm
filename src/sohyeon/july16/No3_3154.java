package sohyeon.july16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://blog.naver.com/whiteflower_/221600084530
/*
 * 문제
우리가 핸드폰으로 알람시계를 설정할 때는 시간과 분을 나타내는 4개의 숫자를 입력하기 위해 키보드를 사용한다. 

예를 들어, 우리가 12:30으로 알람을 설정하려고 한다면 1,2,3,0을 입력하면 되고 9시30분 같은 경우는 맨 앞에 0을 붙여 0,9,3,0을 누르면 된다.

그런데 얼마 전, 꿍은 알람시계를 맞추다가 시각을 잘못 입력했는데 화면에 나타나는 시간은 24로 나눈 나머지라는 것을 알게됐다. 

마찬가지로 분 역시 60으로 나눈 나머지가 화면에 나타나는 사실을 알게됐다. 예를 들어 66:79로 시각을 잘못 입력했어도 실제로 화면에는 18:19로 나타난다는 것이다.

꿍은 매우 게을러서 원하는 알람시각을 맞추는데 최소한의 노력만 하고싶다. 

그래서 여러분들은 꿍이 어떻게 하면 최소한의 노력을 들여서 원하는 시각으로 알람을 맞출 수 있을지 알아내는 프로그램을 만들어야 한다.

키보드는 위와 같이 생겼고 키 a에서 키 b로 이동할 때 필요한 노력은 다음과 같다.

effort(a,b) = |xa-xb|+|ya-yb|

여기서 (xa, ya) 와 (xb, yb)는 키a, b의 좌표를 나타낸다.

전체 노력의 합은 첫 번째 키에서 두 번째 키로 이동하는데 필요한 노력, 두 번째 키에서 세 번째 키로 이동하는데 필요한 노력, 

세 번째 키에서 네 번째 키로 이동하는데 필요한 노력의 세 값의 합으로 정의된다.

예를 들어 22:45를 입력하는데 필요한 전체 노력의 값은 effort(2,2)+effort(2,4)+effort(4,5)=0+2+1=3. 이다.

만약 답이 여러 가지라면 가장 빠른 시각을 출력하라.
--
입력
입력의 첫 번째 줄에는 HH:MM 형식으로 설정하고 싶은 시각이 주어진다. 만약 시간이나 분이 한 자리수라면 선행하는 0이 붙어야 한다.

설정하고 싶은 시각은 00:00~23:59 중 하나이다.
--
출력
출력의 첫 번째 줄에는 HH:MM 형식으로 답을 출력한다. 한 자리의 수라면 선행하는 0을 붙여야 한다.
--
예제 입력 1 
14:19
예제 출력 1 
14:79
--
예제 입력 2 
00:11
예제 출력 2 
24:11
--
예제 입력 3 
12:34
예제 출력 3 
12:34
*/
class Pos {
	int x;
	int y;

	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class No3_3154 {

	static Pos list[] = new Pos[10];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		String answer = "";
		int min = 999;
		int HH = Integer.parseInt(st.nextToken()); 									// 시간
		int MM = Integer.parseInt(st.nextToken()); 									// 분

		list[1] = new Pos(0, 0);
		list[2] = new Pos(0, 1);
		list[3] = new Pos(0, 2);
		list[4] = new Pos(1, 0);
		list[5] = new Pos(1, 1);
		list[6] = new Pos(1, 2);
		list[7] = new Pos(2, 0);
		list[8] = new Pos(2, 1);
		list[9] = new Pos(2, 2);
		list[0] = new Pos(3, 1);

		for (int i = 0; i < 5; i++) {
			int NHH = HH + (24 * i);
			
			for (int j = 0; j < 2; j++) {
				int NMM = MM + (60 * j);
				if (NHH >= 100 || NMM >= 100)
					continue;
				String H = "", M = "";
				
				if (min > effort(NHH, NMM)) {
					min = effort(NHH, NMM);
					
					if (NHH < 10)													// 숫자가 한자리일 때 0 추가
						H = "0" + NHH;
					else
						H = NHH + "";
					if (NMM < 10)													// 숫자가 한자리일 때 0 추가
						M = "0" + NMM;
					else
						M = NMM + "";
					answer = (H + ":" + M);
				}
				//System.out.println(NHH + " " + NMM + " " + effort(NHH, NMM));
			}
		}

		System.out.println(answer);

	}

	public static int effort(int HH, int MM) {											// effort 구하는 함수
		int Hfirst = HH / 10;
		int Hlast = HH % 10;
		int Mfirst = MM / 10;
		int Mlast = MM % 10;

		return Math.abs(list[Hfirst].x - list[Hlast].x) + Math.abs(list[Hfirst].y - list[Hlast].y)
				+ Math.abs(list[Mfirst].x - list[Hlast].x) + Math.abs(list[Mfirst].y - list[Hlast].y)
				+ Math.abs(list[Mlast].x - list[Mfirst].x) + Math.abs(list[Mlast].y - list[Mfirst].y);


	}

}
