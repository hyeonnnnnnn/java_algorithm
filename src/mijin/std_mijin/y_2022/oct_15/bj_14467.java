package mijin.std_mijin.y_2022.oct_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
����
���� ���� �ǳʰ� ������ ���������� ��� ������ �Ǿ� ������, �ǿܷ� �Ұ� ���� �ǳʰ� ������ ���� ������ ���� ����. �� ������ ������ ������ �־��� ��� ���� �� �������κ��� �Ұ� ���� �ǳʴ� ������ ���� ���� ���Ǹ� �ް� �Ǿ���.

���� �� ���� �Ұ� ���� �ǳʴ� ���� �����ϴ� ���̴�. ���� ���� ��ġ�� N�� �����ϴµ�, �� ������ ���� ��ȣ�� ���� ��ġ �ϳ������� �̷���� �ִ�. ���� �Ҹ� 10���� ������ �����Ƿ� ���� ��ȣ�� 1 �̻� 10 ������ ������, ���� ��ġ�� ���� ���ʰ� �������� �ǹ��ϴ� 0�� 1 �� �ϳ���.

�� ���� ����� ������ �Ұ� �ּ� �� �� ���� �ǳԴ��� �˾ƺ���. �� ���� ��ȣ�� �Ұ� ��ġ�� �ٲ� ���� �� ������ ���� �ȴ�.

�Է�
ù �ٿ� ���� Ƚ�� N�� �־�����. N�� 100 ������ ���� �����̴�. ���� N�ٿ��� �� �ٿ� �ϳ��� ���� ����� �־�����. ���� ����� ���� ��ȣ�� ��ġ(0 �Ǵ� 1)�� �̷���� �ִ�.

���
ù �ٿ� �Ұ� ���� �ǳʰ� �ּ� Ƚ���� ����Ѵ�.

���� �Է� 1 
8
3 1
3 0
6 0
2 1
4 1
3 0
4 0
3 1
���� ��� 1 
3
��Ʈ
3�� �Ҵ� ��ġ 1, 0, 1���� �����Ǿ����Ƿ� ���� �ּ� �� �� �ǳ����� Ȯ���� �� �ִ�. 4�� �ҵ� ���� �� �� �ǳ�����, ������ �Ҵ� ���� �ǳ� ����� Ȯ�ε��� �ʴ´�.*/
public class bj_14467 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cow [] =new int [11]; //�� ���� ��ġ
		int min = 0; //�ٲ� �ּ� Ƚ��
		int N,cnum,road; //�Է¹ޱ�
		
		
		//�迭 �ʱ�ȭ
		for(int i=0;i<cow.length;i++) {
			cow[i] =-1;
		}
		
		N =Integer.parseInt(br.readLine());
		StringTokenizer st=  null;
		for(int i=0;i<N;i++) {
			st =new StringTokenizer(br.readLine());
			cnum =Integer.parseInt( st.nextToken());
			road =Integer.parseInt( st.nextToken());
			if(cow[cnum]==-1) //ó�� ���� ���
				cow[cnum] =road;
			else if(cow[cnum] != road) { //���� �����̶� �ٸ� ���
				cow[cnum] =road; min++;
				
			}
			
		}
		
		System.out.println(min);
		
	}

}
