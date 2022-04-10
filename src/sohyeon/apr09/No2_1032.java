package sohyeon.apr09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����
���� -> ���� -> cmd�� �ĺ���. ���� ȭ���� ���� ���δ�. ���⼭ dir�̶�� ġ�� �� ���丮�� �ִ� ������丮�� ������ ��� ���´�. �̶� ���ϴ� ������ ã������ ������ ���� �ϸ� �ȴ�.

dir *.exe��� ġ�� Ȯ���ڰ� exe�� ������ �� ���´�. "dir ����"�� ���� ġ�� �� ���Ͽ� �´� ���ϸ� �˻� ����� ���´�.

���� ���, dir a?b.exe��� �˻��ϸ� ���ϸ��� ù ��° ���ڰ� a�̰�, �� ��° ���ڰ� b�̰�, Ȯ���ڰ� exe�� ���� ��� ���´�.

�̶� �� ��° ���ڴ� �ƹ��ų� ���͵� �ȴ�. ���� ���, acb.exe, aab.exe, apb.exe�� ���´�.

�� ������ �˻� ����� ���� �־����� ��, �������� �� �ľ� �� ����� ���������� ����ϴ� �����̴�.

���Ͽ��� ���ĺ��� "." �׸��� "?"�� ���� �� �ִ�. �����ϸ� ?�� ���� ��� �Ѵ�. �� ���丮���� �˻� ����� ���� ���ϸ� �ִٰ� �����ϰ�, ���� �̸��� ���̴� ��� ����.
--
�Է�
ù° �ٿ� ���� �̸��� ���� N�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �̸��� �־�����.

N�� 50���� �۰ų� ���� �ڿ����̰� ���� �̸��� ���̴� ��� ���� ���̴� �ִ� 50�̴�. �����̸��� ���ĺ� �ҹ��ڿ� '.' �θ� �̷���� �ִ�.
--
���
ù° �ٿ� ������ ����ϸ� �ȴ�.
--
���� �Է� 1 
3
config.sys
config.inf
configures
���� ��� 1 
config????
--
���� �Է� 2 
2
contest.txt
context.txt
���� ��� 2 
conte?t.txt
--
���� �Է� 3 
3
c.user.mike.programs
c.user.nike.programs
c.user.rice.programs
���� ��� 3 
c.user.?i?e.programs
--
���� �Է� 4 
4
a
a
b
b
���� ��� 4 
?
--
���� �Է� 5 
1
onlyonefile
���� ��� 5 
onlyonefile
*/

public class No2_1032 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());						// ���� �̸� ����
		StringBuilder pattern = new StringBuilder();					// ����
		
		String[] str = new String[N];									// �Է¹��� ���ϸ� �迭 ����
		
		for (int i = 0; i < N; i++) {									// ���ϸ� N�� �Է¹���
			str[i] = br.readLine();
		}
		
		for (int i = 0; i < str[0].length(); i++) {
			boolean flag = true;
			
			for (int j = 1; j < N; j++) {
				if (str[0].charAt(i) != str[j].charAt(i)) {				// ù ��° ���ϸ�� ������ ���ϸ� �� ���� ��, ����ġ�� ���
					flag = false;
					break;
				}
			}
			
			if (flag) {													// ���� ��ġ�� ��� �״�� append 
				pattern.append(str[0].charAt(i));
				
			} else {													// ���� ����ġ�� ��� ? append
				pattern.append("?");
				
			}
		}
		
		System.out.println(pattern);
		br.close();
	}

}
