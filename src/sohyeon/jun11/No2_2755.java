package sohyeon.jun11;

import java.util.Scanner;

/*
 * 문제
최백준이 이번 학기에 들은 과목과 학점 그리고 성적이 주어졌을 때, 평균 평점을 계산하는 프로그램을 작성하시오.

성적은 A+~F까지 총 13개가 있다.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0

평균 평점은 각 과목의 학점*성적을 모두 더한 뒤에, 총 학점으로 나누면 된다.
--
입력
첫째 줄에, 백준이가 이번 학기에 들은 과목 수가 주어진다. 둘째 줄부터 N개의 줄에 각 과목의 과목명, 학점, 성적이 주어진다.

과목명은 알파벳 소문자와 숫자, 그리고 밑줄 (_)로만 이루어져 있으며, 최대 100글자이고, 학점은 1보다 크거나 같고, 3보다 작거나 같은 자연수이다.

성적은 문제에 설명한 13가지 중 하나이다. 
--
출력
첫째 줄에 평균 평점을 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력한다. (평균 평점이 1.5이면 1.50을 출력한다.)
--
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
3.28
*/

public class No2_2755 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();																// 과목 수
		String[][] arr = new String[n][3];
	
		double sum = 0;																		// 학점 * 성적 합
		double point = 0;																	// 학점 합
		
		for(int i = 0; i < n; i++) {
			double temp = 0;																// 한 과목 성적
			
			for(int j = 0; j < 3; j++) {
					arr[i][j] = sc.next();													// 과목명, 학점, 성적 입력받기
			}
			
			String score = arr[i][2];														// 성적(문자) 가져와서
			
			// 성적에 따른 점수
			if (score.charAt(0) == 'A') temp = 4; 
			if (score.charAt(0) == 'B') temp = 3; 
			if (score.charAt(0) == 'C') temp = 2; 
			if (score.charAt(0) == 'D') temp = 1;
		    if (score.charAt(1) == '+') temp += 0.3; 
		    if (score.charAt(1) == '-') temp -= 0.3;
		    
			sum += Integer.parseInt(arr[i][1]) * temp;										// 총합  = 학점 * 성적
			point += Integer.parseInt(arr[i][1]);											// 학점합  += 학점 
		}

		System.out.println(String.format("%.2f", sum/point));
		sc.close();
	}
}