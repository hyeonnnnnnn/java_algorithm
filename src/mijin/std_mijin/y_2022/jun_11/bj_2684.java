package mijin.std_mijin.y_2022.jun_11;

import java.util.Scanner;

/*����
���������� �ַ� �� ����� �Բ� ���� �����̴�. �� �� 3-���������� ���� ���� �� �� �ִ� �����̴�. �� ����� ���� 3-�������� �� �ϳ��� �����Ѵ�. 3-���������̶� �� �� �հ� ���� �����̰�, 8����(�ڵڵ�,�ڵھ�,�ھյ�,�ھվ�,�յڵ�,�յھ�,�վյ�,�վվ�)�� �ִ�.

���� ������ ���� 1���� 40�� ������. �� ���� ������ ������ ������ �������� ���� ������� ���̿� ���´�. �� ���� 3-���������� ���� �� ���� ���Դ��� ����Ѵ�. ���� ���� ���� ������ ������ ����� �̱��.

���� 40�� ���� ����� �־����� ��, 3-���������� ���� �� �� ���Դ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 40���� ������ ��� �ո��� ��� �վվ��� 38�� ��Ÿ����.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� P(1 �� P �� 1000)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ������ 40�� ���� ����� �־�����. �̶�, �ո��� H��, �޸��� T�� ǥ���Ѵ�. 

���
�� �׽�Ʈ ���̽����� 3-���������� �� �� ��Ÿ�������� ����Ѵ�. �ڵڵ�, �ڵھ�, �ھյ�, �ھվ�, �յڵ�, �յھ�, �վյ�, �վվ� ������� �������� �����ؼ� ����Ѵ�.
���� �Է� 1 
4
HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
HHTTTHHTTTHTHHTHHTTHTTTHHHTHTTHTTHTTTHTH
HTHTHHHTHHHTHTHHHHTTTHTTTTTHHTTTTHTHHHHT
���� ��� 1 
0 0 0 0 0 0 0 38
38 0 0 0 0 0 0 0
4 7 6 4 7 4 5 1
6 3 4 5 3 6 5 6

*
*
*/


public class bj_2684 {
final static int CT= 40;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p =s. nextInt();
		int [] arr = {0,0,0,0,0,0,0,0};
		StringBuilder sb = new StringBuilder();
		String st = "";
	
		
		for(int t=0;t<p;t++) {
			//���� �ʱ�ȭ
			sb.setLength(0);
			zero(arr); //0���� �ʱ�ȭ 
			
			st = s.next();
			//ù 3�� �ޱ� 
			sb.append('s');
			sb.append(st.charAt(0));
			sb.append(st.charAt(1));
			
			for(int i=2;i<CT;i++) {
				sb.deleteCharAt(0);
				sb.insert(2,st.charAt(i));
				switch(sb.toString()) {
				case "TTT":
					arr[0]++;
					break;
				case "TTH":
					arr[1]++;
					break;
				case "THT":
					arr[2]++;
					break;
				case "THH":
					arr[3]++;
					break;
				case "HTT":
					arr[4]++;
					break;
				case "HTH":
					arr[5]++;
					break;
				case "HHT":
					arr[6]++;
					break;
				case "HHH":
					arr[7]++;
					break;
				}
				//System.out.println(i+" "+sb);
			}
			
			for(int cc =0;cc<8;cc++) {
				System.out.print(arr[cc]+" ");
			}
			System.out.println();
		}//���̽� ���� 
		
	}
	public static void zero(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] =0;
		}

	}

}
