package mijin.std_mijin.y_2022.apr_9;

import java.util.Scanner;

/*�ֱٿ� ���ߵ� ������ ������ 1����(��߿�)���� 10����(������)���� 10���� �������� �ִ� �뼱���� ����ǰ� �ִ�. �� �������� Ÿ�ų� ������ ��� ���� �ڵ����� �ν��� �� �ִ� ��ġ�� �ִ�. �� ��ġ�� �̿��Ͽ� ��߿����� ���������� ���� ���� ���� �ȿ� ����� ���� ���� ���� ��� ���� ����Ϸ��� �Ѵ�. ��, �� ������ �̿��ϴ� ������� ���� �ǽ��� ��ö�Ͽ�, ������ ������ Ż ��, ���� ����� ��� ���� �Ŀ� ������ ź�ٰ� �����Ѵ�.
*/
public class bj_2460 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p =0;
		int max=0;
		
		for(int i=0;i<10;i++) {
			p -= s.nextInt();
			p += s.nextInt();
			
			if(max<p) 
				max =p;
			
		}
		System.out.println(max);

	}

}
