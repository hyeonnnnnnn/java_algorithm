package sohyeon.may22;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/*
 * 문제
오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
--
입력
첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다.

참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
--
출력
첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
--
예제 입력 1 
1 1
예제 출력 1 
MON
--
예제 입력 2 
3 14
예제 출력 2 
WED
--
예제 입력 3 
9 2
예제 출력 3 
SUN
--
예제 입력 4 
12 25
예제 출력 4 
TUE

*/
public class No1_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();										// 월
		int y = sc.nextInt();										// 일
		
        LocalDate date = LocalDate.of(2007, x, y);
        
//        System.out.println(date);									// 2007-x-y 형태 출력
        
        DayOfWeek dayOfWeek = date.getDayOfWeek();					// 숫자 요일 구하기
        
//        int dayOfWeekNumber = dayOfWeek.getValue();				// 숫자 요일 출력        
//        System.out.println(dayOfWeekNumber);
        
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());
        
		sc.close();
	}

}
