package sohyeon.jun11;

import java.util.Scanner;

/*
 * ����
Cryptoquote�� � �޽����� ���� ��, �� ���ĺ��� �ٸ� ���ĺ����� ��ȯ�� ��ȣȭ �ϴ� ����̴�.

���� ���, HPC PJVYMIY�� �޽����� ���� ��, �̸� ���� �޽����� �ٲ۴ٸ� ACM CONTEST�� �ȴ�.

���� ���� �ٲٴ� ��Ģ�� H=A, P=C, C=M, J=O, V=N, Y=T, M=E, I=S�̴�. ��ó�� Cryptoquote�� �Ϸ���, ���ڿ� ���� ������ ��Ģ�� �־�� �Ѵ�.

��ȣȭ�� �޽����� ���ڿ� ���� ������ ��Ģ�� �־����� ��, �̸� ���� �޽����� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1000)�� �־�����. �� �׽�Ʈ ���̽��� ������ ���� �� �ٷ� �����Ǿ� �ִ�.

�׽�Ʈ ���̽��� ù° �ٿ��� ��ȣȭ�� �޽����� �־�����, ��° �ٿ��� ��ȯ ��Ģ�� �־�����. ��ȯ ��Ģ�� ���ĺ� �빮�� 26���ڷ� �̷�����ְ�, ��ȣȸ�� �޽����� ���̴� 100 �����̴�.

ù ��° ���ڴ� A�� �ش��ϴ� ����, �� ��°�� B, ..., 26��°�� Z�� �ش��ϴ� �����̴�. ��ȯ ��Ģ�� �ߺ����� �ʴ´�. 

��ȣȭ�� �޽������� ������ ���� �� �ְ�, �̰��� ���� �޽������� ���ԵǾ�� �Ѵ�.
--
���
�� �׽�Ʈ ���̽��� ���ؼ� �� �ٿ� �ϳ��� ���� �޽����� ����Ѵ�.
--
���� �Է� 1 
2
HPC PJVYMIY
BLMRGJIASOPZEFDCKWYHUNXQTV
FDY GAI BG UKMY
KIMHOTSQYRLCUZPAGWJNBVDXEF
���� ��� 1 
ACM CONTEST
THE SKY IS BLUE
*/
public class No1_2703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();														// �׽�Ʈ���̽� ����
		int tmp;
		String str = "";															// ��ȣȭ�� �޽���
		String s = "";																// ��ȯ ��Ģ
		char[] chArray = new char[26];
		
		sc.nextLine();
		
		for(int i = 0; i < T * 2; i++) {
			str = sc.nextLine();
			s = sc.nextLine();
			
			for(int j = 0; j < chArray.length; j++) {
				chArray[j] = s.charAt(j);											// ��ȯ��Ģ �迭�� ����
			}

			for(int k = 0; k < str.length(); k++) {
				tmp = Integer.valueOf(str.charAt(k));								// �޽��� ���ĺ� �ϳ������� ���ڰ� ����
				
				if(tmp >= 65 && tmp <= 90) {										// �޽��� �빮�ڰ��̱� ������ 65~90 ������ ���� ���
					System.out.print(chArray[tmp-65]);
				} else {
					System.out.print((char)tmp);
				}
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
