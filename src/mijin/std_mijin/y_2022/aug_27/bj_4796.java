package mijin.std_mijin.y_2022.aug_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_4796 {
	/*
	 * 캠핑 다국어 시간 제한 메모리 제한 제출 정답 맞힌 사람 정답 비율 1 초 128 MB 20633 8185 6963 39.366% 문제
	 * 등산가 김강산은 가족들과 함께 캠핑을 떠났다. 하지만, 캠핑장에는 다음과 같은 경고문이 쓰여 있었다.
	 * 
	 * 캠핑장은 연속하는 20일 중 10일동안만 사용할 수 있습니다.
	 * 
	 * 강산이는 이제 막 28일 휴가를 시작했다. 이번 휴가 기간 동안 강산이는 캠핑장을 며칠동안 사용할 수 있을까?
	 * 
	 * 강산이는 조금 더 일반화해서 문제를 풀려고 한다.
	 * 
	 * 캠핑장을 연속하는 P일 중, L일동안만 사용할 수 있다. 강산이는 이제 막 V일짜리 휴가를 시작했다. 강산이가 캠핑장을 최대 며칠동안
	 * 사용할 수 있을까? (1 < L < P < V)
	 * 
	 * 입력 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, L, P, V를 순서대로 포함하고
	 * 있다. 모든 입력 정수는 int범위이다. 마지막 줄에는 0이 3개 주어진다.
	 * 
	 * 출력 각 테스트 케이스에 대해서, 강산이가 캠핑장을 최대 며칠동안 사용할 수 있는지 예제 출력처럼 출력한다.
	 * 
	 * 예제 입력 1 5 8 20 5 8 17 0 0 0 예제 출력 1 Case 1: 14 Case 2: 11
	 */
	public static void main(String[] args) throws IOException {
		int L,P,V;
		int i=1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			L=Integer.parseInt(st.nextToken());
			P=Integer.parseInt(st.nextToken());
			V=Integer.parseInt(st.nextToken());
			
			if(L==0 && P==0 && V==0)
				break;
			System.out.println("Case "+i+": " + (((V/P)*L) + ( (V%P)>L?P:(V%P))) );
			i++;
			
			
		}

	}

}
