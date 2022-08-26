package mijin.std_mijin.y_2022.aug_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*����
���� ������ ����� 12������ �̷���� �ִ�.

A A# B C C# D D# E F F# G G#

�� 12���� ������ �ݺ��ȴ�. G#���� �������� A�̴�.

�� ���� ������ ���� ���� �����̴�. #�� "����"��� ������, ���� ���� �����ٴ� ���̴�. "A#"�� A�� ���� ���� ���̶�� ���̴�.

�÷��� ���� �����ٴ� ���̴�. �� ���������� 'b'�� ǥ���Ѵ�.

#�� b�� �̿��Ѵٸ�, ���� ���� ���� ���� �̸����� �θ� �� �ִ�. A#�� Bb�� ���� ���̴�. B#�� C�� ������, Fb�� E�� ����.

���ű��� ���� �߿��� �� �� �ϳ��̴�. ���ű��̶� � ���� ��� ���� ������ ���� ������ŭ �ø��ų� ���ߴ� �۾��̴�. ���ű� �۾��� ���� ��, ��� ������ ���� ���� ����(���� ����)�� �۾��� �ϱ� ���� ���ƾ� �Ѵ�.

� ���� �־����� ��, ���ű��� �ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� ù° �ٿ��� � ���� ���� ������ �־�����. ���� ���� �ϳ� �Ǵ� �� �̻��� �������� ���еǾ� �ִ�. ���� �ٿ��� ���ű��ؾ� �ϴ� ���� �־�����. �� ���� ����� ��� �� ����ŭ ���� �Űܾ� �ϰ�, ������ ��� �Ʒ��� �Űܾ� �Ѵ�.

�Է��� ������ �ٿ��� "***"�� �־�����.

���
�� �׽�Ʈ ���̽��� ���ؼ�, ���ű��� ����� ����Ѵ�. ����ϴ� ���� ���� ���� �����ִ� 12�� ���� �����ִ� ���̾�� �Ѵ�.

���� �Է� 1 
C# E Db G#
1
D E# D A
-1
***
���� ��� 1 
D F D A
C# E C# G#*/
public class bj_4732 {
	public static String [] st = {"A", "A#", "B", "C", "C#", "D", "D#" ,"E", "F", "F#", "G", "G#"};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c =0;
		
		while(true) {
			String [] tmp =br.readLine().split(" "); //�Է� ���ٹޱ�
			
			if(tmp[0].charAt(0)=='*')
				break;
			c=Integer.parseInt(br.readLine()); //���ప ���� -48xxxx
	
			int[] rs =new int[tmp.length] ; //��� index 
			
			for(int i=0;i< rs.length;i++) {
				rs[i] = searchidx(tmp[i]);
				 
				//���� ���̸��̸�
				if(rs[i] ==-1) {
					if(tmp[i].charAt(1) =='#') {
						rs[i]=searchidx(String.valueOf( tmp[i].charAt(0) ) )+1;
						
					}else {
						rs[i]=searchidx(String.valueOf( tmp[i].charAt(0) ) )-1;
					
					}
				}
				rs[i]+=c; //�ø�.���� �ݿ�
				
				//�迭 �ʰ� ó��
				if(rs[i]>11) {
					rs[i]=rs[i]%12;
				}
				else if (rs[i] <0) {
					rs[i]=12+rs[i];
				}
				System.out.print(st[rs[i]]+" ");
			}
			System.out.println();
			
		}
		

	}
	
	//st�迭���� ���� ������ �ε����� ã�Ƽ� ����
	public static int searchidx(String t) {
		int a =-1; //ã�� ���谡 ���� �迭��  ������ -1
		for(int i=0;i<st.length;i++) 
			if(st[i].equals(t))
				a=i; //������ �� �ε��� ����
		return a;
		}

}
