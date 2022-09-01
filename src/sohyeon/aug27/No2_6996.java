package sohyeon.aug27;

import java.util.Arrays;
import java.util.Scanner;

/*����
�� �ܾ� A�� B�� �־����� ��, A�� ���ϴ� ���ĺ��� ������ �ٲپ B�� ���� �� �ִٸ�, A�� B�� �ֳʱ׷��̶�� �Ѵ�.

�� �ܾ �ֳʱ׷����� �ƴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ����(<100)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 100�� ���� �ʴ� �ܾ �������� ���еǾ �־�����. 

�ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
--
���
�� �׽�Ʈ ���̽����� �ֳʱ׷����� �ƴ����� ��ü ��°� ���� �������� ����Ѵ�. 
--
��� ����
��Ȯ�� ��� ������ ���⿡�� �� Java�� �����ϸ� Ȯ���� �� �ִ�.
--
���� �Է� 1 
3
blather reblath
maryland landam
bizarre brazier
���� ��� 1 
blather & reblath are anagrams.
maryland & landam are NOT anagrams.
bizarre & brazier are anagrams.
*/
public class No2_6996 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();													// �׽�Ʈ���̽� ����
		
		char[] ch1 = new char[T];												// �ܾ�A ���� ������ �迭
	    char[] ch2 = new char[T];												// �ܾ�B ���� ������ �迭
	    
		for(int i = 0; i < T; i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			ch1 = str1.toCharArray();											// ���ڿ� �迭�� ��ȯ
			ch2 = str1.toCharArray();
			
			Arrays.sort(ch1);													// ���� ������� �� �迭 ����
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {										// �迭 �� -> ��ġ
				System.out.println(str1+ " & " +str2+ " are anagrams.");
				
			} else {															// �迭 �� -> ����ġ
		    	System.out.println(str1+ " & " +str2+ " are NOT anagrams.");
		    	
		    }
		}
		
		sc.close();
	}

}
