package mijin.std_mijin.y_2022.apr_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*어떤 블로그 참고했음 */

public class bj_1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num=0; //입력 수
		//>???
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner br =  new Scanner(System.in);
		
		num = br.nextInt();
		
		int sum=1; //타겟 대각선 라인
		int i=2; //분자 분모 합 (대각선 i번째 라인)
		int bf =0; //전 대각선  마지막 값 번호 
		int rs[] = new int[2]; //분자 분모
		
		//System.out.println("num ="+num);
		while (sum<num) { //대각선 라인 끝번이 해당 번호 보다 작을 때 까지 
			bf = sum;
			sum+=i;
			i++;
		}
		num -=bf;
		if(i%2==0) { //짝수 라인, 왼->오 라인
			rs[0]=i-num;
			rs[1] = num;
		}else {
			rs[0] =num;
			rs[1] = i-num;
		}
		
		System.out.println(rs[0]+"/"+rs[1]);
		

	}

}
