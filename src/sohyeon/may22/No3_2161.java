package sohyeon.may22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * ����
N���� ī�尡 �ִ�. ������ ī��� ���ʷ� 1���� N������ ��ȣ�� �پ� ������, 1�� ī�尡 ���� ����, N�� ī�尡 ���� �Ʒ��� ���·� ������� ī�尡 ���� �ִ�.

���� ������ ���� ������ ī�尡 �� �� ���� ������ �ݺ��ϰ� �ȴ�. �켱, ���� ���� �ִ� ī�带 �ٴڿ� ������. �� ����, ���� ���� �ִ� ī�带 ���� �Ʒ��� �ִ� ī�� ������ �ű��.

���� ��� N=4�� ��츦 ������ ����. ī��� ���� ���������� 1234 �� ������ �����ִ�. 1�� ������ 234�� ���´�.

���⼭ 2�� ���� �Ʒ��� �ű�� 342�� �ȴ�. 3�� ������ 42�� �ǰ�, 4�� ������ �ű�� 24�� �ȴ�.

���������� 2�� ������ ����, ���� ī����� ������� 1 3 2�� �ǰ�, ���� ī��� 4�� �ȴ�.

N�� �־����� ��, ���� ī����� ������� ����ϰ�, �������� ���� �Ǵ� ī�带 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
--
�Է�
ù° �ٿ� ���� N(1 �� N �� 1,000)�� �־�����.
--
���
ù° �ٿ� ������ ī����� ������� ����Ѵ�. ���� ���������� ���� �Ǵ� ī���� ��ȣ�� ����Ѵ�.
--
���� �Է� 1 
7
���� ��� 1 
1 3 5 7 4 2 6
*/
public class No3_2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			queue.offer(i);									// ť�� �ϳ��� �Է�
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			sb.append(queue.poll()).append(" ");				// ���� ���� �ִ� ī�� ������ sb�� ������(����)�� �Բ� ����

			if(queue.isEmpty()) break;							// ť�� ��� ����
			
			queue.offer(queue.poll());							// ���� ���� �ִ� ī�� �Ʒ��� �̵�
		}
		
		System.out.println(sb);
		
		sc.close();
	}

}
