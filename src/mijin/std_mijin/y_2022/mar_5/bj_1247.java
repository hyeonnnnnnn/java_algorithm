package mijin.std_mijin.y_2022.mar_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/*N���� ������ �־�����, �� �������� �� S�� ��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
/* https://umilove98.tistory.com/57 */
public class bj_1247 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		BigInteger zero = new BigInteger("0"); //0���� �ʱ�ȭ 
		
		for (int i=0;i<3;i++) {
			n=Integer.parseInt(br.readLine());
			BigInteger s= zero;
			for (int j=0;j<n;j++) {
				BigInteger now = new BigInteger(br.readLine());
				s=s.add(now);//���ϱ�
			}
			if(s.compareTo(zero)==0) { //����� 0�̸�
				System.out.println(0);
			}else if(s.compareTo(zero)==1) { //����� �����
				System.out.println("+");
			}else { //����� ������
				System.out.println("-");
			}
			//compareto ������ ��� 1:ũ�� , 0:����, -1:�۴� 
			// ���ڿ��� ��� 0:���� �׿� �� ���ڿ� ������ ���̰�
		}

	}

}
