package mijin.std_mijin.y_2022.apr_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*� ��α� �������� */

public class bj_1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num=0; //�Է� ��
		//>???
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner br =  new Scanner(System.in);
		
		num = br.nextInt();
		
		int sum=1; //Ÿ�� �밢�� ����
		int i=2; //���� �и� �� (�밢�� i��° ����)
		int bf =0; //�� �밢��  ������ �� ��ȣ 
		int rs[] = new int[2]; //���� �и�
		
		//System.out.println("num ="+num);
		while (sum<num) { //�밢�� ���� ������ �ش� ��ȣ ���� ���� �� ���� 
			bf = sum;
			sum+=i;
			i++;
		}
		num -=bf;
		if(i%2==0) { //¦�� ����, ��->�� ����
			rs[0]=i-num;
			rs[1] = num;
		}else {
			rs[0] =num;
			rs[1] = i-num;
		}
		
		System.out.println(rs[0]+"/"+rs[1]);
		

	}

}
