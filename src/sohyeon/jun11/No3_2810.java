package sohyeon.jun11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://kjs-dev.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%9E%90%EB%B0%94-2810-%EC%BB%B5%ED%99%80%EB%8D%94

/*
 * ����
�ʳ��̸� ������ ���Ѵ�.

�����̳� ���׿� ���� ������ �����, �����̴� ���忡 �����. �������� �ݶ� �� ��, �ڸ��� ���� �����̴� ū ȥ���� ������.

���� ��Ȧ���� �̹� �� ������� �����߱� ������ �ݶ� ���� �� Ȧ���� ������ �����̴�.

��ȭ�� ���� ���� �ݶ� �տ� ��� �ִ� �����̴� ���忡 �ٽ� ���� ���� �� �ݶ� �� Ȧ���� ���ڴٴ� ������ �� �� ���� ���ư���.

������ �� �ٿ��� �ڸ��� N���� �ִ�. ���� ������ �¼� ���̿��� ��Ȧ���� �ϳ��� �ְ�, �� �� �¼����� ��Ȧ���� �ϳ��� �� �ִ�.

��, �� ���忡�� Ŀ�ü��� �ִ�. Ŀ�ü� ���̿��� ��Ȧ���� ����.

������ �� ���� ������ �־�����. �̶�, �� �ٿ� ������� ��� �ɾ��� ��, ��Ȧ���� ���� ���� �� �ִ� �ִ� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

��� ����� ���� �� ���� ��� �ְ�, �ڽ��� �¼��� �� ���� �ִ� ��Ȧ������ ���� ���� �� �ִ�.

S�� �Ϲ� �¼�, L�� Ŀ�ü��� �ǹ��ϸ�, L�� �׻� �ΰ��� ������ �־�����.

� �¼��� ��ġ�� SLLLLSSLL�϶�, ��Ȧ���� *�� ǥ���ϸ� �Ʒ��� ����.

*S*LL*LL*S*S*LL*
���� ������ ��� �� ���� ��Ȧ���� ����� �� ����.
--
�Է�
ù° �ٿ� �¼��� �� N�� �־�����. (1 �� N �� 50) ��° �ٿ��� �¼��� ������ �־�����.
--
���
���� ��Ȧ���� ���� �� �ִ� �ִ� ����� ���� ����Ѵ�.
--
���� �Է� 1 
3
SSS
���� ��� 1 
3
--
���� �Է� 2 
4
SLLS
���� ��� 2 
4
--
���� �Է� 3 
9
SLLLLSSLL
���� ��� 3 
7
*/

public class No3_2810 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());										// �¼� ����
		
		String str = br.readLine();
		
		int count = 1;																	// ��Ȧ�� �� �� �ִ� ��� ��
		
		for (int i = 0; i < N; i++) {
			if (str.charAt(i) == 'S')
				count++;
			else if (str.charAt(i) == 'L') {
				count += 1;
				i++;
			}
		}
		/*
		num == �¼���
		count == ���� ��Ȧ���� ���� �� �ִ� �ִ� ����� ��
		������� �¼������ٴ� ���� �� ���� ������ ��� ���� ���� ��, �¼����� �������� �մϴ�.
		*/
		if (N > count) {
			System.out.println(count);
			
		} else {
			System.out.println(N);
			
		}
		
		bw.flush();
		bw.close();
	}

}
