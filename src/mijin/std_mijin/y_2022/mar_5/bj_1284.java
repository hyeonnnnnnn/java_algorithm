package mijin.std_mijin.y_2022.mar_5;

import java.util.Scanner;

public class bj_1284 {

	public static void main(String[] args) {
		int num [] = new int[999]; //�Է�
		int out [] = new int[999];
		int i =0; //�ε��� ��
		
		Scanner s = new Scanner(System.in);
		
		for (i=0;i<99999;i++) {
			//ǥ���� �� �Է¹ޱ�
			num[i] = s.nextInt();
			out[i] = printwd( Integer.toString(num[i]) );
			if ( num[i] ==0) {
				break;
			}
		}
		
		for (int j= 0;j<i;j++) {
			System.out.println(out[j]);
		}

	}	


 static int printwd (String num) {
	int len =0; 
	//int i=0;
	String [] arr = num.split("");
	for (String s:arr){
		//���� �˻�
		switch (s) {
			case "1":
				len += 2;
				//System.out.println(s+" 2�߰���");
				break;
			case "0" :
				len += 4;
				//System.out.println(s+" 4�߰���");
				break;
			default:
				len +=3;
				//System.out.println(s+" 3�߰���");
		}
	}
	//���� ���� ����
	len += num.length()+1;
	return len;
 }
}
