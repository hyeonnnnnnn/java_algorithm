package baekjoon_std.bronze1;


/*
 * ù° �ٿ� ���� ũ�� N�� �־�����. N�� 1�̻� 100������ �����̴�. �� ���� N�ٿ� ���� N���� ���ڰ� �����µ� '.'�� �ƹ��͵� ���� ���� �ǹ��ϰ�, 'X'�� ���� �ִ� ���� �ǹ��Ѵ�.
 * 
 * 
 * 
 * 
 * 5
....X
..XX.
.....
.XX..
X....
 * */
import java.util.Scanner;

public class bj_1652 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); 
		int c =0; //�����ڸ� ����
		int col[]= new int[N];
		int colt[]= new int[N];
		int row[]= new int[N];
		int cc=0,rr=0; //�ջ�
		
		//�ʱ�ȭ
		for(int i=0;i<N;i++) {
			col[i]=0;
			row[i]=0;
			colt[i] =0;
		}
		
		String tmp;
		for(int i=0;i<N;i++) { //��
			tmp =s.next();
			for(int j=0;j<N;j++) { //��
				
				if(tmp.charAt(j) =='.') {
					c++;
					colt[j]++; //�� ���� .�̸� ++
				}else {
					c=0;
					colt[j]=0;
				}
				//�� �࿡ �ΰ��̻� �����̸� ++
				if(c>=2) {
					row[i]++; //i �࿣ �����ڸ��� �ִ�
				}
				//�� ���� �ΰ� �̻� �����̸� ++
				if(colt[j]>1)
					col[j]++;
			}
		}
		//�����ڸ��� �ִ� ��,�� ���� ���ϱ� 
		for(int i=0;i<N;i++) {
			if(col[i] >0) {
				cc++;
			}
			if(row[i] >0) {
				rr++;
			}
		}
		
	
		System.out.println(rr+" "+ cc);

	}

}
