package mijin.std_mijin.y_2022.jun_25;
/*
문제
최백준이 이번 학기에 들은 과목과 학점 그리고 성적이 주어졌을 때, 평균 평점을 계산하는 프로그램을 작성하시오.

성적은 A+~F까지 총 13개가 있다.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0

평균 평점은 각 과목의 학점*성적을 모두 더한 뒤에, 총 학점으로 나누면 된다.

입력
첫째 줄에, 백준이가 이번 학기에 들은 과목 수가 주어진다. 둘째 줄부터 N개의 줄에 각 과목의 과목명, 학점, 성적이 주어진다. 과목명은 알파벳 소문자와 숫자, 그리고 밑줄 (_)로만 이루어져 있으며, 최대 100글자이고, 학점은 1보다 크거나 같고, 3보다 작거나 같은 자연수이다. 성적은 문제에 설명한 13가지 중 하나이다. 

출력
첫째 줄에 평균 평점을 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력한다. (평균 평점이 1.5이면 1.50을 출력한다.)

예제 입력 1 
7
General_Physics_1 3 A+
Introduction_to_Computer_Science_and_Eng 3 B0
Reading_And_Writing 2 C0
English_1 3 C+
Analytic_Geometry_and_Calculus_1 3 B+
Fortran_Programming 3 B+
C_Language_Programming 3 A+
예제 출력 1 
3.28*/

import java.util.Scanner;

public class bj_2755 {
final static float Ap =(float) 4.3;
final static float A =(float) 4.0;
final static float Am =(float) 3.7;
final static float Bp =(float) 3.3;
final static float B =(float) 3.0;
final static float Bm =(float) 2.7;
final static float Cp =(float) 2.3;
final static float C =(float) 2.0;
final static float Cm =(float) 1.7;
final static float Dp =(float) 1.3;
final static float D =(float) 1.0;
final static float Dm =(float) 0.7;
final static float F =(float) 0.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float sum=0;
		float h =0; //학점
		float s =0; //점수
		int cnt =0;//총 학점 
		String str="";
		String tmp="";
		int N = sc.nextInt();
		//버퍼비우기 
		sc.nextLine();
		
		for(int i=0;i<N;i++) {
			str = sc.nextLine();
			
			tmp= str.substring(str.length()-2,str.length()); 
			h = Float.parseFloat(str.substring(str.length()-4,str.length()-3));
			
		
			if(tmp.equals("A+"))
				s=Ap;
			else if(tmp.equals("A0"))
				s=A;
			else if(tmp.equals("A-"))
				s=Am;
			else if(tmp.equals("B+"))
				s=Bp;
			else if(tmp.equals("B0"))
				s=B;
			else if(tmp.equals("B-"))
				s=Bm;
			else if(tmp.equals("C+"))
				s=Cp;
			else if(tmp.equals("C0"))
				s=C;
			else if(tmp.equals("C-"))
				s=Cm;
			else if(tmp.equals("D+"))
				s=Dp;
			else if(tmp.equals("D0"))
				s=D;
			else if(tmp.equals("D-"))
				s=Dm;
			else if(tmp.equals("F"))
				s=F;
			sum +=s*h;
			cnt+=h;

		}
		System.out.printf("%.2f",(float)sum/cnt);
			
		
	}

}
