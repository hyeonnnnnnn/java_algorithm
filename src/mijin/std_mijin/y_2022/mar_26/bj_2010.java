package mijin.std_mijin.y_2022.mar_26;

import java.util.Scanner;

/*첫째 줄에 멀티탭의 개수 N이 주어진다. (1 ≤ N ≤ 500,000) 
이어서 둘째 줄부터 N개의 줄에 걸쳐 각 멀티탭이 몇 개의 플러그를 꽂을 수 있도록 되어 있는지를 나타내는 자연수가 주어진다.
이 자연수는 1,000을 넘지 않는다.*/

public class bj_2010 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N ;
		N=s.nextInt(); //멀티탭 개수
		int sum=0; //최종 꽂을 수 있는 개수

		for(int i=0;i<N;i++) 
			sum +=s.nextInt();
	
		System.out.println(sum-(N-1));
		s.close();
	}

}
