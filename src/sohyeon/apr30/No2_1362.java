package sohyeon.apr30;

import java.io.IOException;
import java.util.Scanner;
// https://blog.naver.com/PostView.nhn?blogId=tlstjd436&logNo=222076526880
/*
 * ����
����� �������� ���� �⸣�� �ֽ��ϴ�. �� ���� ���� ǥ��, ���� ǥ���� ������ ������, ���� �״´ٸ� '�巯�����ϴ�.'

�꿡�Դ� ���� ü���� �ֽ��ϴ�. ���� ���� ü���� ���� ü���� 1/2�踦 �ʰ��ϸ鼭 ���� ü���� 2�� �̸��̶�� ���� �ູ�մϴ�.

���� ���� ü���� 0 ������ ��� ���� ����ϰ� �Ǹ�, �� ���� ��� ���� ���Ŵϴ�.

����� �ܼ��� ���� �꿡�� �Ʒ��� �� ���� �ۿ��� �� �� �ֽ��ϴ�.

'E'�� ���ڸ� �Է��� ���� ���ų �� �ֽ��ϴ�. �Էµ� ����(n)��ŭ�� �ð�(��; minute)�� ������ ���� ���� ü���� n �����մϴ�.
'F'�� ���ڸ� �Է��� �꿡�� ���̸� �� �� �ֽ��ϴ�. �Էµ� ����(n)��ŭ �꿡�� ���̸� �ָ� ���� ���� ü���� n �����մϴ�.
�� �ۿ뿡 �Է��� �� �ִ� ���ڴ� 1 �̻�, 999 ������ �����Դϴ�. �� �ۿ��� ���� ������ ���� �ڽ��� ���¸� ǥ���ϸ�, ���� �߰��� �״´ٸ� ������ �ۿ��� ���õ˴ϴ�.
--
�Է�
�Է��� ��ȣ�� ���� �ó�������� �����˴ϴ�. �ó������� 1������ ���۵Ǹ� 1�� �����մϴ�.

���� ü��(o)�� ���� ü��(w)�� �� �ٿ� �Էµ����ν� �ó������� ���۵˴ϴ�(10 �� o, w �� 1000).

�� ���� �ٺ��� �꿡 ���� �ۿ��� �� �ٿ� �ϳ��� �־�����, "# 0"�� ������ �ٷ� �Ͽ� �ó������� ����˴ϴ�. "# 0"�� ó������ �ʽ��ϴ�.

�꿡�� ���� �� �ۿ��� 'E' �Ǵ� 'F'�� �����ϸ�, ������ �ΰ� ���� n (1 �� n �� 999)�� �־����ϴ�.

��� �ó������� ������ "0 0"�� �ԷµǸ�, "0 0"�� ó������ �ʽ��ϴ�.
--
���
�� �ó������� ���Ͽ�, �ó����� ��ȣ�� ��� �ۿ��� �Ϸ�� �� ���� ���¸� �������� �����Ͽ� �� �پ� ����մϴ�.

�ູ�� ���, ":-)"�� ����մϴ�.
���� ��� ":-("�� ����մϴ�.
����� ��� "RIP"�� ����մϴ�.
--
���� �Է� 1 
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
���� ��� 1 
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
			
			int start = normal / 2;												 // 1/2�ʰ�
			int end = normal * 2;												 // 2�� �̸�.
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
																				// �߰��� ������ Ȯ���ϱ�.
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
