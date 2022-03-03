package mijin.std_mijin.y_2022.mar_5;

import java.util.Scanner;

/* 1598 _ 22/03/02 수
 * 동물원에서 막 탈출한 원숭이 한 마리가 세상구경을 하고 있다. 그 녀석은 원주 부근을 돌아다니다가 코레스코 콘도에서 아주 재밌는 놀이를 발견했다. 그 놀이의 이름은 바로 “꼬리를 무는 숫자 나열”. 이제부터 원숭이가 그토록 좋아하던 그 놀이를 파헤쳐보자.
놀이의 방법은 간단하다. 일단 4줄짜리 표에 왼쪽부터 수를 아래로 1부터 순서대로 적어나간다. 다음에 그 예가 잘 나타나있다.
이제 원숭이는 두 개의 자연수를 아무거나 생각한다. 그리고 숫자판에서 두 개의 자연수 사이의 직각거리를 구하면 된다. 여기서 직각거리는 동서방향거리와 남북방향거리의 합을 뜻한다.
예를 들어 저 숫자판에서 11과 33을 생각했다고 하자. 그렇다면 11과 33사이의 직각거리는 8이 된다.(동서방향거리 : 6, 남북방향거리 : 2) 다음 그림에 잘 나타나있다.
하지만 원숭이는 지금 혼란스럽다. 동물원에서 탈출한지 얼마 되지 않아서 계산을 할 수 없는 경지에 이르렀다. 여러분이 불쌍한 원숭이를 좀 도와줘야겠다. 원숭이가 생각한 두 자연수 사이의 직각거리를 구하는 프로그램을 작성하시오.
*/

public class bj_1598 {

	public static void main(String[] args) {
		int a,b; //큰수 a 작은수 b
		int tmp; //큰수 작은수 바꿀 때 쓸 변수
		int row ; //세로
		int col ; //가로
		
		Scanner s = new Scanner(System.in);
		a =s.nextInt();
		b=s.nextInt();
		
		//큰수를 a에
		if (a<b) {
			tmp =a;
			a=b;
			b=tmp;
		}
		
		System.out.printf("큰수 %d 작은수 %d", a,b);
		System.out.println();
		//가로 길이 구하기 
		//같은 줄일 경우 스킵 //-1씩은 표 아래쪽 수가 나머지가 클 수 있도록 바꿔준 것
		if((a-1)/4 == (b-1)/4) {
			col=0;
		}
		else { 
			//앞 수가 아래쪽에 있는 경우 두 수의 차가 0이 아니면 4로나눈 몫에 +1 
			if( ((b-1)%4)>((a-1)%4))
				col =((a-b)%4==0)?(a-b)/4:((a-b)/4)+1;
			else
				col =(a-b)/4;
				
		}
		System.out.printf("가로   %d",col);
		
		//세로길이 구하기
		if ((a%4)==(b%4)) {
			row =0;
		}else {
			tmp =((a-1)%4)-((b-1)%4);
			row =(tmp>0?tmp:tmp*-1);
		}
		
		System.out.printf("세로   %d",row);
		System.out.println();
		System.out.println(row+col);
		
		
		s.close();
		
	}

}
