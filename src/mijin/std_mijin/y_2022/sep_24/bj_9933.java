package mijin.std_mijin.y_2022.sep_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_9933 {
	/*
	 * �α����� ��й�ȣ �ٱ��� �ð� ���� �޸� ���� ���� ���� ���� ��� ���� ���� 1 �� 128 MB 6638 2496 2124
	 * 37.747% ���� â���̴� �α����� ��ǻ�͸� ��ŷ�� �ؽ�Ʈ ���� �ϳ��� �ڽ��� ���Ϸ� �����ߴ�. ���Ͽ��� �ܾ �� �ٿ� �ϳ���
	 * �����־���, �� �� �ϳ��� �α��̰� �¶��� �������� ����ϴ� ��й�ȣ�̴�.
	 * 
	 * ������ ���캸�� â���̴� ��� �ܾ��� ���̰� Ȧ����� ����� �˾Ƴ�����. �׸��� ������ �α��̰� �� ��Ͽ� ���ؼ� ����ߴ� ����
	 * �����س´�. �α����� ��й�ȣ�� ��Ͽ� ���ԵǾ� ������, ��й�ȣ�� ����� �� ���ڿ��� ���ԵǾ� �ִ�.
	 * 
	 * ���� ���, �α����� ��й�ȣ�� "tulipan"�� ��쿡 ��Ͽ��� "napilut"�� �����ؾ� �Ѵ�. �� �� ���� ������ ���� ���
	 * ��й�ȣ�� ��� �����ϴٰ� �Ѵ�.
	 * 
	 * �α����� ���Ͽ� �����ִ� �ܾ ��� �־����� ��, ��й�ȣ�� ���̿� ��� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� �ܾ��� �� N (2 �� N �� 100)�� �־�����. ���� N�� �ٿ��� ���Ͽ� �����ִ� �ܾ �� �ٿ� �ϳ��� �־�����.
	 * �ܾ�� ���ĺ� �ҹ��ڷθ� �̷���� ������, ���̴� 2���� ũ�� 14���� ���� Ȧ���̴�.
	 * 
	 * ��� ù° �ٿ� ��й�ȣ�� ���̿� ��� ���ڸ� ����Ѵ�. �׻� ���� ������ ��츸 �Է����� �־�����.
	 * 
	 * ���� �Է� 1 4 las god psala sal ���� ��� 1 3 a ���� �Է� 2 4 kisik ptq tttrp tulipan ����
	 * ��� 2 5 s
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		StringBuffer sb=null; //��� ���ڿ� 
		String [] arr= new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0;i<N-1;i++) {
			sb =new StringBuffer(arr[i]).reverse();
		
			for(int t=i;t<N;t++) {
				//System.out.println(sb+" "+arr[t]);
				
				if(sb.toString().equals(arr[t])) { //string�ν��Ͻ�ȭ �ʿ� 
					System.out.println(arr[t].length()+ " "+arr[t].charAt( (arr[t].length()/2)) );
					System.exit(0);
				}
			}
		}
		

	}

}
