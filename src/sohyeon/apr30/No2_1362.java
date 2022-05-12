package sohyeon.apr30;

import java.io.IOException;
import java.util.Scanner;
// https://blog.naver.com/PostView.nhn?blogId=tlstjd436&logNo=222076526880
/*
 * 문제
당신은 게임으로 펫을 기르고 있습니다. 이 펫은 웃는 표정, 슬픈 표정을 가지고 있으며, 만약 죽는다면 '드러눕습니다.'

펫에게는 적정 체중이 있습니다. 펫의 실제 체중이 적정 체중의 1/2배를 초과하면서 적정 체중의 2배 미만이라면 펫은 행복합니다.

펫의 실제 체중이 0 이하일 경우 펫은 사망하게 되며, 그 외의 경우 펫은 슬픕니다.

당신은 콘솔을 통해 펫에게 아래의 두 가지 작용을 할 수 있습니다.

'E'와 숫자를 입력해 펫을 운동시킬 수 있습니다. 입력된 숫자(n)만큼의 시간(분; minute)이 지나면 펫의 실제 체중이 n 감소합니다.
'F'와 숫자를 입력해 펫에게 먹이를 줄 수 있습니다. 입력된 숫자(n)만큼 펫에게 먹이를 주면 펫의 실제 체중이 n 증가합니다.
각 작용에 입력할 수 있는 숫자는 1 이상, 999 이하의 정수입니다. 매 작용이 끝날 때마다 펫은 자신의 상태를 표시하며, 펫이 중간에 죽는다면 이후의 작용은 무시됩니다.
--
입력
입력은 번호를 가진 시나리오들로 구성됩니다. 시나리오는 1번부터 시작되며 1씩 증가합니다.

적정 체중(o)와 실제 체중(w)가 한 줄에 입력됨으로써 시나리오가 시작됩니다(10 ≤ o, w ≤ 1000).

그 다음 줄부터 펫에 가할 작용이 한 줄에 하나씩 주어지며, "# 0"을 마지막 줄로 하여 시나리오가 종료됩니다. "# 0"은 처리하지 않습니다.

펫에게 가할 각 작용은 'E' 또는 'F'로 시작하며, 공백을 두고 숫자 n (1 ≤ n ≤ 999)이 주어집니다.

모든 시나리오가 끝나면 "0 0"이 입력되며, "0 0"은 처리하지 않습니다.
--
출력
각 시나리오에 대하여, 시나리오 번호와 모든 작용이 완료된 후 펫의 상태를 공백으로 구분하여 한 줄씩 출력합니다.

행복한 경우, ":-)"을 출력합니다.
슬픈 경우 ":-("을 출력합니다.
사망한 경우 "RIP"를 출력합니다.
--
예제 입력 1 
100 100
F 10
F 10
E 20
# 0
50 30
F 5
E 20
# 0
0 0
예제 출력 1 
1 :-)
2 :-(
*/
public class No2_1362 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		sc = new Scanner(src);
		int idx = 0;
		
		while (true) {
			int normal = sc.nextInt();
			int now = sc.nextInt();

			if (normal == 0 && now == 0)
				break;
			
			int start = normal / 2;												 // 1/2초과
			int end = normal * 2;												 // 2배 미만.
			sc.nextLine();
			
			boolean die = false;
			
			while (true) {
				
				String line = sc.nextLine();
				
				if (line.equals("# 0"))
					break;
				
				if (!die) {
					String[] check = line.split(" ");
					
					if (check[0].equals("E")) {
						now -= Integer.parseInt(check[1]);
						
					} else if (check[0].equals("F")) {
						now += Integer.parseInt(check[1]);
						
					}
																				// 중간에 죽은거 확인하기.
				}
				if (now <= 0) {
					die = true;
				}
			}

			idx++;
			if (now <= 0) {
				System.out.println(idx + " RIP");
				continue;
			}
			if (start < now && end > now) {
				System.out.println(idx + " :-)");
				continue;
			}
			System.out.println(idx + " :-(");
		}
		
		sc.close();
	}

//	private static String src = "100 100\r\n" + "F 10\r\n" + "F 10\r\n" + "E 200\r\n" + "# 0\r\n" + "50 30\r\n"
//			+ "F 5\r\n" + "E 20\r\n" + "# 0\r\n" + "0 0";
	
}
