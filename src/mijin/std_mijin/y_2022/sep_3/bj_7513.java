package mijin.std_mijin.y_2022.sep_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*�ػ� ���α׷��� ��ȸ �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	315	211	189	67.021%
����
�رԴ� �غ����� �������� �����迡 �˸������ؼ� ���α׷��� ��ȸ�� �����Ϸ��� �Ѵ�. ��ȸ�� �غ��ϴ� ��, ��� ���̽��Ͽ��� Poke�� �����ϴ��� ���� ��û�� �������� ���ߴ�.

��ȸ�� �����ϴ� ������� ��� ���̵�� ��й�ȣ�� �̿��� �ý��ۿ� �α����ؾ� �Ѵ�. ���� ��û�� �������� �ʾұ� ������, ��� ������� ���̵�� "userN" �����̴�. ��й�ȣ�� ������� ������ �� ���� ������ �Ѵ�. �����ϰų� ������ ���� ��쿡�� ��ȸ ���߿� �ٸ� ����� ���̵�� �α����� �� �� �ֱ� �����̴�.

��й�ȣ�� ������ �̿��� �����, �Է��ϱⰡ �ణ ����� �� �ִ�. ����, �������� �ܾ� N���� ã�� ȭ�鿡 ��� ����, �Է��ؾ� �ϴ� �ܾ� ������ �˷��ִ� ����� ����ϱ�� �ߴ�.

�ܾ��� ��ϰ� �� �������� ������ �־����� ��, ��� ����� ��й�ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ְ�, ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����.

�� �׽�Ʈ ���̽��� ù° �ٿ��� �ܾ��� ���� 1 �� m �� 50�� �־�����. ���� m�� �ٿ��� �ܾ �� �ٿ� �ϳ��� �־�����. �� �ܾ��� ���̴� �ִ� 5�����̰�, ������ �������� �ʴ´�. ���� �ٿ��� �������� �� 1 �� n �� 200�� �־�����, ���� n�� �ٿ��� �� �������� ��й�ȣ ������ �־�����. 

��й�ȣ ������ ���� 1 �� k �� 10 �� �����ϸ�, ��й�ȣ�� �̷�� �ִ� �ܾ��� �����̴�. ���� k�� ���ڴ� �ܾ��� �ε����� ��Ÿ����, ������� �ش��ϴ� �ܾ ������ ���ڿ��� ��й�ȣ�̴�.

���
�� �׽�Ʈ ���̽����� ù° �ٿ��� "Scenario #i:"�� ����ϰ�, ���� �ٺ��� ������� �� �������� ��й�ȣ�� ����Ѵ�.

�׽�Ʈ ���̽� ���̿� �� ���� ����Ѵ�.

���� �Է� 1 
2
4
an
bar
doh
mu
2
4 0 0 0 0
2 3 1
2
a
r
1
10 0 1 1 1 1 1 1 1 1 1
���� ��� 1 
Scenario #1:
anananan
mubar

Scenario #2:
arrrrrrrrr*/
public class bj_7513 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int casen =Integer.parseInt( br.readLine());
		int m ;
		int n;
		int k;
		for(int c=1;c<=casen;c++) {
			System.out.println("Scenario #"+c+":");
			
			m=Integer.parseInt( br.readLine());//�ܾ��
			String wordlist [] = new String [m];
			for(int i=0;i<m;i++) {
				wordlist[i]=br.readLine();
			}
			
			n=Integer.parseInt( br.readLine());//�ο���
			for(int i=0;i<n;i++) {
				st= new StringTokenizer(br.readLine());
				k=Integer.parseInt(st.nextToken()); //�ܾ��
				
				for(int t=0;t<k;t++) {
					System.out.print( wordlist[ Integer.parseInt(st.nextToken()) ] );
				}
				System.out.println();
			}
		}
		
	}

}
