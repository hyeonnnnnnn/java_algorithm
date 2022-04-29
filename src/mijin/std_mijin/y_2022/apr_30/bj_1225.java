package mijin.std_mijin.y_2022.apr_30;

import java.util.Scanner;

/*A×B를 계산하다 지겨워진 형택이는 A×B를 새로운 방법으로 정의하려고 한다.

A에서 한 자리를 뽑고 × B에서 임의로 한 자리를 뽑아 곱한다.

의 가능한 모든 조합 (A가 n자리, B가 m자리 수라면 총 가능한 조합은 n×m개)을 더한 수로 정의하려고 한다.

예를 들어 121×34는

1×3 + 1×4 + 2×3 + 2×4 + 1×3 + 1×4 = 28

이 된다. 이러한 형택이의 곱셈 결과를 구하는 프로그램을 작성하시오.*/

public class bj_1225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B ; 
		int sum=0;
		A=sc.nextInt(); B=sc.nextInt();
		int btmp=B,atmp=A; //나누고 남은 수 담기 
		int ax,bx;
		
		for (int i=4;i>=0;i--) {
			ax=(int) (atmp/Math.pow(10, i));
			atmp =(int) (atmp%Math.pow(10, i));
			btmp =B;
			for(int j=4;j>=0;j--) {
				bx=(int) (btmp/Math.pow(10, j));
				btmp =(int) (btmp%Math.pow(10, j));
				sum+=ax*bx;
			}
		}
		System.out.println(sum);
		
		
	}

}
