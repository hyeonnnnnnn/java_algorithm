package mijin.std_mijin.y_2022.sep_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*�ֳʱ׷� �ٱ���
�ð� ����	�޸� ����	����	����	���� ���	���� ����
1 ��	128 MB	5363	2613	2272	51.160%
����
�� �ܾ� A�� B�� �־����� ��, A�� ���ϴ� ���ĺ��� ������ �ٲپ B�� ���� �� �ִٸ�, A�� B�� �ֳʱ׷��̶�� �Ѵ�.

�� �ܾ �ֳʱ׷����� �ƴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ����(<100)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 100�� ���� �ʴ� �ܾ �������� ���еǾ �־�����. �ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.

���
�� �׽�Ʈ ���̽����� �ֳʱ׷����� �ƴ����� ��ü ��°� ���� �������� ����Ѵ�. 

��� ����
��Ȯ�� ��� ������ ���⿡�� �� Java�� �����ϸ� Ȯ���� �� �ִ�.

���� �Է� 1 
3
blather reblath
maryland landam
bizarre brazier
���� ��� 1 
blather & reblath are anagrams.
maryland & landam are NOT anagrams.
bizarre & brazier are anagrams.*/
public class bj_6996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcase = Integer.parseInt(br.readLine()); //���̽�
		//���ĺ� �ε���
		int[] Abal = new int [26];
		int[] Bbal = new int [26];
		StringTokenizer st ;
		
		for(int i=0;i<tcase;i++) {
			st = new StringTokenizer(br.readLine()); //���ĺ� �Է�
			String a= st.nextToken();
			String b= st.nextToken();
			
			clear(Abal);
			clear(Bbal);
			//���ڼ��� �ٸ���� pass
			if(a.length() != b.length()) {
				System.out.println(a +" & "+ b + " are NOT anagrams.");
				continue;
			}
			
			for(int k =0;k<a.length();k++) {
				Abal[a.charAt(k)-97]++;
				Bbal[b.charAt(k)-97]++;
			}
			//������
			for(int k=0;k<a.length();k++) {
				if(Abal[k]!=Bbal[k]) {
					System.out.println(a +" & "+ b + " are NOT anagrams.");
					continue;
				}
			}
			
			System.out.println(a +" & "+ b + " are anagrams.");
			
		}
		
	}
	
	public static void clear(int [] arr) {
		for(int i=0;i<arr.length;i++)
			arr[i] =0;
	}

}
