package baekjoon_std.bronze1;

/*�ð� ����	�޸� ����	����	����	���� ���	���� ����
2 ��	128 MB	1236	721	651	63.389%
����
��ǥ�� �����̴� ���� �ַ���� ��� �ϸ鼭 �ٸ� ����� �ڽŵ��� �ַ���� ���� ���ϰ� �ϵ��� ���� �޽����� �ְ���� �� �޽����� ��ȣȭ �Ͽ��� �ְ�޾Ҵ�. ��ȣ�� ����� ����� ������ ����. ���� ��ȣȭ �� ���ڿ��� 1,1���� ������ �Ʒ� ������� ä���. �׸��� ���� ���� ���� ä�� �Ŀ��� ������ ������ �ٽ� ���� ������ �ݺ��Ѵ�.

���࿡ "abcdefghijkl" �̶�� ���ڿ��� 3���� ���� ��ȣȭ �Ѵٰ� ����. �׷��� ������ ���� ǥ�� ä�� �� ���� ���̴�.

a	e	i
b	f	j
c	g	k
d	h	l
�׷� �Ŀ��� ���� ���� �� ������, ������ �� ����, ���� �� ������ ... ���� �����鼭 �ٽ� ���ڿ��� �����. ���� ��쿡�� "aeijfbcgklhd" �� �� ���̴�.

�츮�� �� ���� ������ ����. ��ȣȭ �� ���ڿ��� �� ���� ���� ��ȣȭ�� �Ͽ����� �־��� ���� �� ������ ���ڿ��� ���ϴ� ���α׷��� �ۼ��Ͽ���.

�Է�
���� ���� K(1 �� K �� 20)�� �־����� �� ��° �ٿ��� ��ȣȭ �� ���ڿ�(��� ���ҹ���)�� �־�����. (���ڿ��� ���̴� 200 �����̸� K�� ����̴�.)

���
ù �ٿ� ������ ���ڿ��� ����Ѵ�..

���� �Է� 1 
3
aeijfbcgklhd
���� ��� 1 
abcdefghijkl
*/
// f11 ���� f6�Ѵܰ辿 f8 ������� ���� 

import java.util.Scanner;

public class bj_1855 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int col=s.nextInt();
		String str=s.next();
		int c=0; //��������
		int flag=0; //Ż�� �÷���
		char ca [][] =new char[200][col];
		int rowcnt;
		if(str.length()%col==0)
			rowcnt = str.length()/col;
		else
			rowcnt = str.length()/col+1;
		
		//�д� ���� �ݿ��ؼ� �迭 ä���
		for(int i=0;i<rowcnt;i++) {
			if(i%2 ==0) {
				for(int j=0;j<col;j++) {
					ca[i][j] = str.charAt(c);
					c++;
					if(c>str.length()-1) {
						flag =1;
						break;
					}
				}
			}
			else {
				for(int j=col-1;j>=0;j--) {
					ca[i][j] =str.charAt(c);
					c++;
				}
				if(c>str.length()-1) {
					flag=1;
					break;
				}
			}
			if(flag ==1) { //���ڿ� �� �־����� Ż�� 
				break;	
			}
		}
		flag=0;
		c=0;
		//���
		
		for(int i=0;i<col;i++) {
			for(int k=0;k<rowcnt;k++) {
				c++;
				if(c>str.length()) {
					flag=1;
					break;
				}
				System.out.print(ca[k][i]);
			}
			if(flag==1)
				break;
		}
		
		
	}

}
