package mijin.std_mijin.y_2022.apr_30;

import java.util.Scanner;

/*ü������ 8��8ũ���̰�, ���� ĭ�� �Ͼ� ĭ�� �����ư��鼭 ��ĥ�Ǿ� �ִ�. ���� ���� ��ĭ (0,0)�� �Ͼ���̴�. ü������ ���°� �־����� ��, �Ͼ� ĭ ���� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
*/
public class bj_1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len =8; //�迭 ����
		int cnt=0; //�հ�
		String str[]=new String[len];//�Է�
		
		for (int i=0;i<len;i++) {
			str[i] = sc.nextLine();
			for(int j=0;j<len;j++) {
				if( (str[i].charAt(j)=='F') && ((i+j)%2==0)) {
					cnt+=1;
				}
			}
		}
		
		System.out.println();
	}

}
