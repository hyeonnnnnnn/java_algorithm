package mijin.std_mijin.y_2022.apr_16;

import java.util.Scanner;

/*�� ���� N�� F�� �־�����. �����̴� ���� N�� ���� �� �� �ڸ��� ������ �ٲ㼭 N�� F�� ������ �������� ������� �Ѵ�. ���� ������ ���� ���� �����̸�, �� �� �ڸ��� �����ϸ� �۰� ������� �Ѵ�.

���� ���, N=275�̰�, F=5�̸�, ���� 00�̴�. 200�� 5�� ������ �������� �����̴�. N=1021�̰�, F=11�̸�, ������ 01�ε�, 1001�� 11�� ������ �������� ������
*/
public class bj_1075 {

	public static void main(String[] args) {
		String N; //������ ���� ��
		int F; //������ ��
		long num=0; // ���ڸ� 00���� �ٲ� �� ��
		
		Scanner s = new Scanner(System.in);
		
		N= s.next();
		F=s.nextInt();
		num = Integer.parseInt(N.substring(0,N.length()-2)+"00");
		
		long t=0; //~00�� ���� ������ �� �� 
		String g=String.valueOf(num); //~00 , ������ �������� ������ �� ���� �� ��
		if(num%F !=0 ) {
			t= ((num/F)+1)*F;
			g= String.valueOf(t);
		}
		
		System.out.println(g.substring(g.length()-2,g.length())); //�� �� 2�ڸ��� ��� 
	}

}
