package mijin.std_mijin.y_2022.mar_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1703 {

	public static void main(String[] args) throws IOException {
		
		int leaf=0; //ù ������
		int t =1; //����, ����ġ�� �ε���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] k;
		
		while (true) {
			k = br.readLine().split(" ");
			if (k[0].equals("0"))
				break;
			leaf =1 ;//���ĸ�
			t=1;
			for (int i=0;i<Integer.parseInt(k[0]);i++) {
				leaf *= Integer.parseInt(k[t]);
				leaf -= Integer.parseInt(k[t+1]);
				t+=2;
			}
			System.out.println(leaf);
			
		}
		

	}

}
