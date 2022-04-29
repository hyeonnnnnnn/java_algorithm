package mijin.std_mijin.y_2022.apr_30;

import java.util.Scanner;

/*체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오
*/
public class bj_1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len =8; //배열 길이
		int cnt=0; //합계
		String str[]=new String[len];//입력
		
		for (int i=0;i<len;i++) {
			str[i] = sc.nextLine();
			for(int j=0;j<len;j++) {
				if( (str[i].charAt(j)=='F') && ((i+j)%2==0)) {
					cnt+=1;
				}
			}
		}
		
		System.out.println();
	}

}
