package mijin.std_mijin.y_2022.jul_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
문제
유명한 농부 박현수는 돼지 6마리를 키우고 있다. 그는 하루에 한 번씩 돼지에게 맛있는 밥을 준다.

돼지는 원형 식탁에 앉아서 식사를 한다. 현수의 돼지들은 기억력이 뛰어나기 때문에 전 날 자신의 양쪽과 맞은편에 앉았던 돼지가 먹었던 양을 기억하고 있다. 또, 욕심도 많기 때문에, 그 만큼의 양을 추가하여 식사를 하기를 원한다.

예를 들어, 현수가 1번부터 6번까지 돼지에게 각각 3, 2, 7, 1, 5, 4만큼 밥을 주었다면, 2번 돼지는 첫 날 받은 양 2에다 양쪽과 맞은편 돼지가 받은 양 15(3+7+5)만큼을 더해 17만큼 받기를 원한다.

마음씩 좋은 농부 박현수는 이런 돼지의 요구를 모두 들어주려고 한다. 매일 현수의 집에 신선한 사료가 N만큼 배달된다. 사료의 유통기한은 하루이기 때문에, 남은 사료는 모두 폐기한다.

첫 날 돼지들이 먹었던 양이 주어졌을 때, 현수가 6마리의 돼지들의 요구를 들어줄 수 없게 되는 날이 몇 번째 날인지 구하는 프로그램을 작성하시오.



입력
입력은 T개의 테스트 데이터로 구성된다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터는 두 줄로 구성되어 있고, 첫째 줄에는 하루에 배달되는 사료의 양 N (1<=N<=500,000,000)이 주어진다. 그 다음 줄에는 1, 2, 3, 4, 5, 6번 돼지가 첫 날 먹었던 식사의 양이 빈 칸을 사이에 두고 차례대로 주어진다. 첫째 날에 각 돼지가 먹는 사료의 양은 100이하의 자연수이다.

출력
각 테스트 데이터에 대해, 6마리 돼지의 요구를 모두 들어줄 수 없게 되는 날이 몇 번째 날인지 출력한다.

예제 입력 1 
2
21
1 2 3 4 5 6
21
1 2 3 4 5 7
예제 출력 1 
2
1*/
public class bj_3060 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;// new StringTokenizer(br.readLine());
		
		int T =Integer.parseInt(br.readLine()),N,sum=0,day=1;             //br.read는 string 한 줄을 읽어와 (개행 등 포함) 아스키코드 참조 int형으로만 바꿔준다. 
		for (int i=0;i<T;i++) {
			day=1;
			N= Integer.parseInt(br.readLine());
			st= new StringTokenizer(br.readLine());
			for(int k =0;k<6;k++) {
				sum+=Integer.parseInt(st.nextToken());
			}
			while(N>=sum) {
				sum*=4;
				day++;
			}
			System.out.println(day);
			
		}
		
	

	}

}
