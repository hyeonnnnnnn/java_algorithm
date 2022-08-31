package mijin.std_mijin.y_2022.sep_3;

import java.util.HashSet;
import java.util.Scanner;
//출처 **  https://to-the-universe.tistory.com/5

/*
문제
상근이 방에 걸려있는 시계는 완벽한 원 모양이다. 시계에는 시침과 분침이 원의 중심을 기준으로 돌아가고 있다. 시침은 시를 나타내고, 분침은 분을 나타낸다. 시계에는 60개의 눈금이 지름을 따라서 표시되어 있다. 눈금과 눈금 사이의 거리는 모두 같다.

분침은 1분에 한 번씩 다음 눈금으로 이동한다. 시침은 12분에 한 번식 다음 눈금으로 이동한다. 즉, 1시간이 지나면 다섯 눈금을 이동하게 된다. 이 시계는 시나 분이 바뀌는 순간 즉시 다음 눈금으로 이동한다. 즉, 시침과 분침은 항상 눈금을 가리키고 있으며, 그 사이를 가리키는 경우는 없다.

자정은 시침과 분침이 동시에 가장 윗 눈금을 가리킬 때이다. 즉, 0시와 0분을 나타낸다. 12시간 또는 720분이 지나면, 시침과 분침은 다시 같은 위치로 오게 된다. 이러한 움직임은 계속해서 반복된다. 

생각해보면, 분침이 움직였을 때 시침이 움직이지 않을 수 있다. 하지만, 시침이 움직였다면 항상 분침도 움직였을 것이다.

상근이는 기하를 매우 좋아한다. 따라서, 시계를 볼 때마다 시침과 분침이 이루는 각도를 계산해서 종이에 적어놓는다. 이렇게 몇 년이 지나다보니 종이에는 엄청나게 많은 각도가 적혀져 있었다. 종이를 살펴보던 상근이는 어떤 각도는 반복해서 나오는데, 어떤 각도는 절대 나오지 않는다는 사실을 알게 되었다. 예를 들면, 3시와 9시일 때 시침과 분침이 이루는 각도는 90도이다. 하지만, 65도를 이루는 시간은 없다.

상근이는 시침과 분침이 이루는 각도가 A가 되는 경우가 있는지 없는지를 검사해보려고 한다.

0보다 크거나 같고, 180보다 작거나 같은 정수 A가 주어졌을 때, 상근이의 시계가 각도 A를 이루는 시간이 있는지 없는지를 구하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄이고, 정수 A가 입력으로 주어진다. (0 ≤ A ≤ 180)

출력
각 테스트 케이스에 대해서, 상근이의 시계의 시침과 분침이 이루는 각도가 A도가 되는 경우가 있다면 Y를, 아니면 N을 출력한다.

예제 입력 1 
90
65
66
67
128
0
180
예제 출력 1 
Y
N
Y
N
N
Y
Y*/
public class bj_5675 {

	public static void main(String[] args) {
		int c =6; //6도씩 움직임
		int A;
		int m=0,h=0;
		Scanner s = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//경우의 수 모두 담기
		for(int i=1;i<=24;i++) {
			for(int j=1;j<=60;j++) {
				m=(m+6)%360;
				if(m%72 ==0)
					h = (h+6)%360;
				hs.add(Math.min((h-m)%360,360-((h-m)%360)));
			}
			
		}
		while(true) {
			A =s.nextInt();
			if(hs.contains(A)) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
			
		}
		
		
	}

}
