package mijin.std_mijin.y_2022.aug_20;

import java.util.Scanner;


/*����
�����̴� ���ο� �̹��� ���� �ν� ���α׷��� �������. �� ���α׷��� ���̿� ���� �ִ� ���ڸ� ��ĵ�� ��, �ؽ�Ʈ ���Ϸ� �����Ѵ�. �����̴� ���� ���� ������ ���α׷��� ���������, ���α׷��� �ŷڵ��� 100%�� �ƴϸ�, � ���ڴ� �ν����� ���ߴ�. �ᱹ �����̴� 100%�� �ƴ϶�� ������ �Ǹ��Ͽ���, �������� �������� �Ǿ���.

�������� ���������� �����̸� ����ؼ�, �����̰� ���� �̹��� ���� �ν� ���α׷��� �νķ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�νķ��� �ν��� ������ ���� R, ��ü ������ ���� A��� ���� ��, R/A�̴�. �ٹٲ� ���ڴ� ���ڷ� ���� �ʴ´�.

�Է�
�Է��� N���� �׽�Ʈ ���̽��� �����Ǿ� �ִ�. ù° �ٿ� �׽�Ʈ ���̽��� ���� N�� �־�����. �� �׽�Ʈ ���̽��� ��� �� ���̰�, �ν����� ���� ���ڴ� '#'�� ǥ���Ѵ�. �� �׽�Ʈ ���̽��� �������� �� ���� �� ĭ�� �ִ�. �� ���� 100���ڸ� ���� �ʰ�, ���� ���� 200���� ���� �ʴ´�.

���
�� �׽�Ʈ ���̽��� ���ؼ� �νķ��� ����� �� ������ ���� ����Ѵ�. �� ���� "Efficiency ratio is X%."�� ���� ���·� ����ؾ� �Ѵ�. X�� �νķ��� �ۼ�Ʈ�� ǥ���� ���̰�, �Ҽ��� ���ڸ� �̻��� ��쿡�� ��° �ڸ����� �ݿø��ؼ� ����Ѵ�. ��, �ݿø� ����� �����̸� ���� �κи� ����Ѵ�.

���� �Է� 1 
3
Pr#nt ex##tly one##ine for#eac# te#t c#se.

None.

The i#put consists of
N test ca#es. The number
of th#m (N) is given on
the first #ine
of the#input#file.

���� ��� 1 
Efficiency ratio is 78.6%.
Efficiency ratio is 100%.
Efficiency ratio is 94%.*/

public class bj_3448 {

	public static void main(String[] args) {
		int i=0,N;
		int A=0,R=0; //��ü,�ν�
		String str="",tmp="";
		double tmp2;
		Scanner s=  new Scanner(System.in);
		
		N=s.nextInt();
		str = s.nextLine();
		while(i<N) {
			tmp=s.nextLine();
			if(tmp.length()==0) {
				A+=str.length();
				R+=str.replaceAll("#", "").length();
				
				if(R>0) {
					tmp2=(double)R/A*100;
					if( tmp2%1==0.0) {
						System.out.printf("Efficiency ratio is %d%%" , (int)tmp2); //(R/A)*100 �ȶ� �Ф�
					}
					else {
						System.out.printf("Efficiency ratio is %.1f%%" ,tmp2);
						System.out.println(2);
					}
						i++;
						A=0;R=0;
					
				}else {
					
					str =s.nextLine();
				}
			}else {
				str+=tmp;
			}
		}
		
		

	}

}
