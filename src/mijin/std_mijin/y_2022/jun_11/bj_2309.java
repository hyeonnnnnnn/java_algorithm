package mijin.std_mijin.y_2022.jun_11;

import java.util.Arrays;
import java.util.Scanner;

/*����
�պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.

��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. �پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.

��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.

�Է�
��ȩ ���� �ٿ� ���� �����̵��� Ű�� �־�����. �־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�, ��ȩ �������� Ű�� ��� �ٸ���, ������ ������ ���� ������ ��쿡�� �ƹ��ų� ����Ѵ�.

���
�ϰ� �������� Ű�� ������������ ����Ѵ�. �ϰ� �����̸� ã�� �� ���� ���� ����.*/


public class bj_2309 {

	public static void main(String[] args) {
		int arr[]  = new int[9];
		int sum =0;
		int tmp =0;
		Scanner s  = new Scanner(System.in);
		int ex1 = 0;
		int ex2 = 0;
		int flag=0; //�� ���� Ȯ�ο�
		
		
		//�Է�
		for (int i=0;i<9;i++) {
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		sum -= 100; //100���� ���� ��
		
		
		//�ƴ� �� ã�� 15,25
		for(int i=0;i<9;i++) {
			tmp = sum;

			ex1=arr[i]; //�� 1����
			tmp-=arr[i]; 
		
			for (int j=i+1;j<9;j++) {
				if(arr[j] ==tmp) {
					ex2 = tmp;
					System.out.println("ex2"+ex2);
					flag= 1;
					break;
				}
			}
			if(flag==1)
				break;
			
		}
		
		for(int i=0;i<9;i++) {
			if(arr[i]==ex1 || arr[i] ==ex2) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
		

	}

}
