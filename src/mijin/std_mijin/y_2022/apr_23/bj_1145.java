package mijin.std_mijin.y_2022.apr_23;

import java.util.Scanner;
import java.util.StringTokenizer;

/*�ټ� ���� �ڿ����� �ִ�. �� ���� ��� ��κ��� ����� ���� �� �� ��� �� ���� ������ ���� ���� ���� �ڿ����̴�.

���� �ٸ� �ټ� ���� �ڿ����� �־��� ��, ��� ��κ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
/*���Ʈ ���� �˰��� : ��� �� */
public class bj_1145 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			
			String st = new String(s.nextLine()); //���ڿ� ���ٷ� �޾Ƽ�
			StringTokenizer stn = new StringTokenizer(st); //tokenizer��� �ɰ���
			int num[] = new int[5]; //�� 5��
			int cnt =0,rs=1; //����� ��� ī��Ʈ, ��� ��
			
			//�Է� ���� �� �迭 �ֱ� 
			int i=0;
			while(stn.hasMoreTokens()) {
				num[i] = Integer.parseInt(stn.nextToken());
			    i++;
			}
			
			//��
			while(true){
				cnt=0;
				for(i=0;i<5;i++) {
					if(rs%num[i]==0)
						cnt++;
					if (cnt >=3)
						break;
				}
				if(cnt>=3) 
					break;
				rs+=1;
			}
			
			System.out.println(rs);
			
		
			
			
			

	}

}
