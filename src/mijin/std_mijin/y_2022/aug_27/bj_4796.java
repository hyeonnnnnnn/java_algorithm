package mijin.std_mijin.y_2022.aug_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_4796 {
	/*
	 * ķ�� �ٱ��� �ð� ���� �޸� ���� ���� ���� ���� ��� ���� ���� 1 �� 128 MB 20633 8185 6963 39.366% ����
	 * ��갡 �谭���� ������� �Բ� ķ���� ������. ������, ķ���忡�� ������ ���� ����� ���� �־���.
	 * 
	 * ķ������ �����ϴ� 20�� �� 10�ϵ��ȸ� ����� �� �ֽ��ϴ�.
	 * 
	 * �����̴� ���� �� 28�� �ް��� �����ߴ�. �̹� �ް� �Ⱓ ���� �����̴� ķ������ ��ĥ���� ����� �� ������?
	 * 
	 * �����̴� ���� �� �Ϲ�ȭ�ؼ� ������ Ǯ���� �Ѵ�.
	 * 
	 * ķ������ �����ϴ� P�� ��, L�ϵ��ȸ� ����� �� �ִ�. �����̴� ���� �� V��¥�� �ް��� �����ߴ�. �����̰� ķ������ �ִ� ��ĥ����
	 * ����� �� ������? (1 < L < P < V)
	 * 
	 * �Է� �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, L, P, V�� ������� �����ϰ�
	 * �ִ�. ��� �Է� ������ int�����̴�. ������ �ٿ��� 0�� 3�� �־�����.
	 * 
	 * ��� �� �׽�Ʈ ���̽��� ���ؼ�, �����̰� ķ������ �ִ� ��ĥ���� ����� �� �ִ��� ���� ���ó�� ����Ѵ�.
	 * 
	 * ���� �Է� 1 5 8 20 5 8 17 0 0 0 ���� ��� 1 Case 1: 14 Case 2: 11
	 */
	public static void main(String[] args) throws IOException {
		int L,P,V;
		int i=1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			L=Integer.parseInt(st.nextToken());
			P=Integer.parseInt(st.nextToken());
			V=Integer.parseInt(st.nextToken());
			
			if(L==0 && P==0 && V==0)
				break;
			System.out.println("Case "+i+": " + (((V/P)*L) + ( (V%P)>L?P:(V%P))) );
			i++;
			
			
		}

	}

}
