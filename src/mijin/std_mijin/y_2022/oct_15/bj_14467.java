package mijin.std_mijin.y_2022.oct_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
닭이 길을 건너간 이유는 과학적으로 깊게 연구가 되어 있지만, 의외로 소가 길을 건너간 이유는 거의 연구된 적이 없다. 이 주제에 관심을 가지고 있었던 농부 존은 한 대학으로부터 소가 길을 건너는 이유에 대한 연구 제의를 받게 되었다.

존이 할 일은 소가 길을 건너는 것을 관찰하는 것이다. 존은 소의 위치를 N번 관찰하는데, 각 관찰은 소의 번호와 소의 위치 하나씩으로 이루어져 있다. 존은 소를 10마리 가지고 있으므로 소의 번호는 1 이상 10 이하의 정수고, 소의 위치는 길의 왼쪽과 오른쪽을 의미하는 0과 1 중 하나다.

이 관찰 기록을 가지고 소가 최소 몇 번 길을 건넜는지 알아보자. 즉 같은 번호의 소가 위치를 바꾼 것이 몇 번인지 세면 된다.

입력
첫 줄에 관찰 횟수 N이 주어진다. N은 100 이하의 양의 정수이다. 다음 N줄에는 한 줄에 하나씩 관찰 결과가 주어진다. 관찰 결과는 소의 번호와 위치(0 또는 1)로 이루어져 있다.

출력
첫 줄에 소가 길을 건너간 최소 횟수를 출력한다.

예제 입력 1 
8
3 1
3 0
6 0
2 1
4 1
3 0
4 0
3 1
예제 출력 1 
3
힌트
3번 소는 위치 1, 0, 1에서 관찰되었으므로 길을 최소 두 번 건넜음을 확인할 수 있다. 4번 소도 길을 한 번 건넜으며, 나머지 소는 길을 건넌 기록이 확인되지 않는다.*/
public class bj_14467 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cow [] =new int [11]; //소 이전 위치
		int min = 0; //바꾼 최소 횟수
		int N,cnum,road; //입력받기
		
		
		//배열 초기화
		for(int i=0;i<cow.length;i++) {
			cow[i] =-1;
		}
		
		N =Integer.parseInt(br.readLine());
		StringTokenizer st=  null;
		for(int i=0;i<N;i++) {
			st =new StringTokenizer(br.readLine());
			cnum =Integer.parseInt( st.nextToken());
			road =Integer.parseInt( st.nextToken());
			if(cow[cnum]==-1) //처음 나온 경우
				cow[cnum] =road;
			else if(cow[cnum] != road) { //이전 방향이랑 다른 경우
				cow[cnum] =road; min++;
				
			}
			
		}
		
		System.out.println(min);
		
	}

}
