package mijin.std_mijin.y_2022.apr_16;

import java.util.Scanner;

/*���� -> ���� -> cmd�� �ĺ���. ���� ȭ���� ���� ���δ�. ���⼭ dir�̶�� ġ�� �� ���丮�� �ִ� ������丮�� ������ ��� ���´�. �̶� ���ϴ� ������ ã������ ������ ���� �ϸ� �ȴ�.

dir *.exe��� ġ�� Ȯ���ڰ� exe�� ������ �� ���´�. "dir ����"�� ���� ġ�� �� ���Ͽ� �´� ���ϸ� �˻� ����� ���´�. ���� ���, dir a?b.exe��� �˻��ϸ� ���ϸ��� ù ��° ���ڰ� a�̰�, �� ��° ���ڰ� b�̰�, Ȯ���ڰ� exe�� ���� ��� ���´�. �̶� �� ��° ���ڴ� �ƹ��ų� ���͵� �ȴ�. ���� ���, acb.exe, aab.exe, apb.exe�� ���´�.

�� ������ �˻� ����� ���� �־����� ��, �������� �� �ľ� �� ����� ���������� ����ϴ� �����̴�. ���Ͽ��� ���ĺ��� "." �׸��� "?"�� ���� �� �ִ�. �����ϸ� ?�� ���� ��� �Ѵ�. �� ���丮���� �˻� ����� ���� ���ϸ� �ִٰ� �����ϰ�, ���� �̸��� ���̴� ��� ����.
*/
public class bj_1032 {

	public static void main(String[] args) {
		int N ;//���� ����
		String ans = ""; //��� 
		Scanner s = new Scanner(System.in);
		
		N= s.nextInt();
		String []list = new String[N] ; //���� �̸���
		
		//�Է¹ޱ�
		for(int i=0;i<N;i++) {
			list[i] = s.next();
		}
		
		char tmp;
		//�˻�
		for (int j=0;j<list[0].length();j++) {
			tmp = list[0].charAt(j); //ù ���� ���ڷ� �ʱ�ȭ 
			for(int k=1;k<N;k++) {
				if(list[k].charAt(j) != tmp) { //1�� �̸����� ���ʷ� ��, �ٸ��� '?'ó�� �� break
					tmp='?';
					break;
				}
			}
			ans =ans +tmp;
		}
		System.out.println(ans);

	}

}
