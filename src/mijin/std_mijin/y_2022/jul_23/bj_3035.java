package mijin.std_mijin.y_2022.jul_23;

import java.util.Scanner;
/*문제
상근이는 매일 아침 영자 신문을 학교에 가져와서 읽는다. 하지만, 상근이의 눈은 점점 나빠졌고, 더 이상 아침 신문을 읽을 수 없는 상황에 이르렀다. 상근이는 스캐너를 이용해서 글자를 확대한 다음에 보려고 한다.

신문 기사는 글자로 이루어진 R*C 행렬로 나타낼 수 있다. 글자는 알파벳과 숫자, 그리고 마침표로 이루어져 있다.

스캐너는 ZR과 ZC를 입력으로 받는다. 이렇게 되면, 스캐너는 1*1크기였던 각 문자를 ZR*ZC크기로 확대해서 출력해 준다.

신문 기사와 ZR, ZC가 주어졌을 때, 스캐너의 스캔을 거친 결과를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 R, C, ZR, ZC가 주어진다. R과 C는 1과 50 사이의 정수이고, ZR과 ZC는 1과 5 사이의 정수이다.

다음 R개 줄에는 신문 기사가 주어진다.

출력
스캐너에 스캔된 결과를 총 R*ZR개 줄에 걸쳐서 C*ZC개 문자씩 출력한다.

예제 입력 1 
3 3 1 2
.x.
x.x
.x.
예제 출력 1 
..xx..
xx..xx
..xx..
예제 입력 2 
3 3 2 1
.x.
x.x
.x.
예제 출력 2 
.x.
.x.
x.x
x.x
.x.
.x.*/



public class bj_3035 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int R=s.nextInt(),C=s.nextInt(),ZR=s.nextInt(),ZC=s.nextInt();
		String tmp;
		
		char [][] ar =  new char [R][C];
		
		//기본 패턴 입력
		for(int i=0;i<R;i++) {
			tmp =s.next();
			for(int j=0;j<C;j++) {
				ar[i][j]=tmp.charAt(j);
			}
		}
		//int i=0,j=0;
		//행당, 열당 확대 비율 만큼 반복 출력
		
		for(int i=0;i<R;i++) {          			//배열에 입력된 해당 행을
			for(int t=0;t<ZR;t++) {     			//ZR번 반복 찍기
				for(int j=0;j<C;j++) {				//열도
					for(int k=0;k<ZC;k++) {			//ZC번 반복 찍기
						System.out.print(ar[i][j]);
					}
				}
				System.out.println();
			}
		}

		
		
	}

}
