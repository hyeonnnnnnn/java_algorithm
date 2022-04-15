package mijin.std_mijin.y_2022.apr_16;

import java.util.Scanner;

/*두 정수 N과 F가 주어진다. 지민이는 정수 N의 가장 뒤 두 자리를 적절히 바꿔서 N을 F로 나누어 떨어지게 만들려고 한다. 만약 가능한 것이 여러 가지이면, 뒤 두 자리를 가능하면 작게 만들려고 한다.

예를 들어, N=275이고, F=5이면, 답은 00이다. 200이 5로 나누어 떨어지기 때문이다. N=1021이고, F=11이면, 정답은 01인데, 1001이 11로 나누어 떨어지기 때문이
*/
public class bj_1075 {

	public static void main(String[] args) {
		String N; //나누어 지는 수
		int F; //나누는 수
		long num=0; // 끝자리 00으로 바꾼 후 수
		
		Scanner s = new Scanner(System.in);
		
		N= s.next();
		F=s.nextInt();
		num = Integer.parseInt(N.substring(0,N.length()-2)+"00");
		
		long t=0; //~00에 가장 근접한 몫 값 
		String g=String.valueOf(num); //~00 , 나누어 떨어지지 않으면 그 다음 몫 값
		if(num%F !=0 ) {
			t= ((num/F)+1)*F;
			g= String.valueOf(t);
		}
		
		System.out.println(g.substring(g.length()-2,g.length())); //맨 뒷 2자리만 출력 
	}

}
