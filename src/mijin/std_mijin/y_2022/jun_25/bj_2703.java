package mijin.std_mijin.y_2022.jun_25;
/*
����
Cryptoquote�� � �޽����� ���� ��, �� ���ĺ��� �ٸ� ���ĺ����� ��ȯ�� ��ȣȭ �ϴ� ����̴�.

���� ���, HPC PJVYMIY�� �޽����� ���� ��, �̸� ���� �޽����� �ٲ۴ٸ� ACM CONTEST�� �ȴ�.

���� ���� �ٲٴ� ��Ģ�� H=A, P=C, C=M, J=O, V=N, Y=T, M=E, I=S�̴�. ��ó�� Cryptoquote�� �Ϸ���, ���ڿ� ���� ������ ��Ģ�� �־�� �Ѵ�.

��ȣȭ�� �޽����� ���ڿ� ���� ������ ��Ģ�� �־����� ��, �̸� ���� �޽����� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1000)�� �־�����. �� �׽�Ʈ ���̽��� ������ ���� �� �ٷ� �����Ǿ� �ִ�.

�׽�Ʈ ���̽��� ù° �ٿ��� ��ȣȭ�� �޽����� �־�����, ��° �ٿ��� ��ȯ ��Ģ�� �־�����. ��ȯ ��Ģ�� ���ĺ� �빮�� 26���ڷ� �̷�����ְ�, ��ȣȸ�� �޽����� ���̴� 100 �����̴�.

ù ��° ���ڴ� A�� �ش��ϴ� ����, �� ��°�� B, ..., 26��°�� Z�� �ش��ϴ� �����̴�. ��ȯ ��Ģ�� �ߺ����� �ʴ´�. ��ȣȭ�� �޽������� ������ ���� �� �ְ�, �̰��� ���� �޽������� ���ԵǾ�� �Ѵ�.

���
�� �׽�Ʈ ���̽��� ���ؼ� �� �ٿ� �ϳ��� ���� �޽����� ����Ѵ�.

���� �Է� 1 
2
HPC PJVYMIY
BLMRGJIASOPZEFDCKWYHUNXQTV
FDY GAI BG UKMY
KIMHOTSQYRLCUZPAGWJNBVDXEF
���� ��� 1 
ACM CONTEST
THE SKY IS BLUE*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_2703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int tmp;
		String sb,sb2;
		char [] conv = new char[26];

		sc.nextLine();
		for(int i=0;i<t*2;i++) {
			sb= sc.nextLine();
			sb2=sc.nextLine();
			//��ȯ���� ����
			for(int t1=0;t1<conv.length;t1++) {
				conv[t1]=sb2.charAt(t1);
			}
			
			for(int kk =0;kk<sb.length();kk++) {
				tmp =Integer.valueOf(sb.charAt(kk));
				if(tmp>=65 && tmp<=90)
					System.out.print(conv[tmp-65]);
				else
					System.out.print((char)tmp);
			}
			System.out.println();
		}
		

	}

}
