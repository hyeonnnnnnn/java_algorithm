package mijin.std_mijin.y_2022.jun_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
����
����̴� ī�� ��ȸ�� �����ߴ�. ��ȸ�� �����迡 ���߰�ǰ�, ������ ����� ��ü�� �Կ��ϰ� �ִ�. ����̴� ���� ������ �������� �ǽð� ������ ����ϴ� ���α׷��� ������� �Ѵ�.

���� ������ R�� C���̴�. ��� ���� ù ��° ���ڴ� 'S'�̰� ��߼��� �ǹ��Ѵ�. ��, ������ ���ڴ� 'F'�̰� �̰��� ��¼��� �ǹ��Ѵ�. ��ȸ�� ������ ���� �� 9���̰�, �� ���� 1���� 9���� ��ȣ�� �Ű��� �ִ�. ī���� �׻� ���� ���� �����ϴ� �� ĭ�� �����ϸ�, ī�� ��ȣ�� ǥ���Ѵ�. ���������� ���� '.'�� ��Ÿ�� �ִ�.

���� ������ ��¼����κ��� ������ �Ÿ��� �����Ѵ�. �������� ������ ����. ����, �� ���� ��¼��� ������ �Ÿ��� ���ٸ�, ���� ����̴�.

�Է�
ù° �ٿ� R�� C�� �־�����. ���� R�� �ٿ��� '.', 'S', 'F', '1'~'9'�� �̷���� ���� ������ �־�����. �� �ٿ��� �ִ� �� ���� ī�ุ �ְ�, ���� ������ �ִ� ī���� �׻� 9���̴�. (10 �� R, C �� 50)

���
����� �� 9���� �ؾ� �Ѵ�. i��° �ٿ��� i�� ���� ����� ����Ѵ�. (i=1~9)
*/
//https://velog.io/@ehdcks3421/%EB%B0%B1%EC%A4%80-%EC%B9%B4%EC%95%BD%EA%B3%BC-%EA%B0%95%ED%92%8D-2891
public class bj_2890 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken()); //���� ��
		int s=Integer.parseInt(st.nextToken()); //ī�� �ջ� �� ��
		int r=Integer.parseInt(st.nextToken()); //ī���� �ѳ� �� ������ ���� ��
		int count=0;
		int arr[]=new int[n+1];
		
		StringTokenizer st1=new StringTokenizer(br.readLine());
		Arrays.fill(arr, 1);
		
		for(int i=1; i<=s; i++)
		{
			int num=Integer.parseInt(st1.nextToken());
			arr[num]-=1;
		}
		
		StringTokenizer st2=new StringTokenizer(br.readLine());
		for(int i=1; i<=r; i++)
		{
			int num=Integer.parseInt(st2.nextToken());
			arr[num]+=1;
		}
		
		for(int i=1; i<=n; i++)
		{
			if(arr[i]==2)
			{
				if(i==1)
				{
					if(arr[i+1]==0)
					{
						arr[i+1]=1;
						arr[i]=1;
					}
				}
						
				else if(i==n)
				{
					if(arr[i-1]==0)
					{
						arr[i-1]=1;
						arr[i]=1;	
					}
				}
				
				else
				{
					if((arr[i-1]==0 && arr[i+1]==0) ||
							(arr[i-1]==0 && arr[i+1]>=1))
					{
						arr[i-1]=1;
						arr[i]=1;	
					}
					else if(arr[i-1]>=1 && arr[i+1]==0)
					{
						arr[i+1]=1;
						arr[i]=1;	
					}
					
				}
				
			}
		}
		
		for(int i=1; i<=n; i++)
		{
			if(arr[i]==0)
				count++;
		}
		
		System.out.println(count);
		
	
	}

}
