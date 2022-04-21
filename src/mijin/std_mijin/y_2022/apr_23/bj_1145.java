package mijin.std_mijin.y_2022.apr_23;

import java.util.Scanner;
import java.util.StringTokenizer;

/*다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.

서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
*/
/*브루트 포스 알고리즘 : 모두 비교 */
public class bj_1145 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			
			String st = new String(s.nextLine()); //문자열 한줄로 받아서
			StringTokenizer stn = new StringTokenizer(st); //tokenizer사용 쪼개기
			int num[] = new int[5]; //수 5개
			int cnt =0,rs=1; //배수일 경우 카운트, 결과 수
			
			//입력 받은 수 배열 넣기 
			int i=0;
			while(stn.hasMoreTokens()) {
				num[i] = Integer.parseInt(stn.nextToken());
			    i++;
			}
			
			//비교
			while(true){
				cnt=0;
				for(i=0;i<5;i++) {
					if(rs%num[i]==0)
						cnt++;
					if (cnt >=3)
						break;
				}
				if(cnt>=3) 
					break;
				rs+=1;
			}
			
			System.out.println(rs);
			
		
			
			
			

	}

}
