package mijin.std_mijin.y_2022.oct_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
종이자르기
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	6756	3745	3092	56.859%
문제
아래 <그림 1>과 같이 직사각형 모양의 종이가 있다. 이 종이는 가로방향과 세로 방향으로 1㎝마다 점선이 그어져 있다. 가로 점선은 위에서 아래로 1번부터 차례로 번호가 붙어 있고, 세로 점선은 왼쪽에서 오른쪽으로 번호가 붙어 있다.



<그림 1>

점선을 따라 이 종이를 칼로 자르려고 한다. 가로 점선을 따라 자르는 경우는 종이의 왼쪽 끝에서 오른쪽 끝까지, 세로 점선인 경우는 위쪽 끝에서 아래쪽 끝까지 한 번에 자른다. 예를 들어, <그림 1>의 가로 길이 10㎝이고 세로 길이 8㎝인 종이를 3번 가로 점선, 4번 세로 점선, 그리고 2번 가로 점선을 따라 자르면 <그림 2>와 같이 여러 개의 종이 조각으로 나뉘게 된다. 이때 가장 큰 종이 조각의 넓이는 30㎠이다.



<그림 2>

입력으로 종이의 가로 세로 길이, 그리고 잘라야할 점선들이 주어질 때, 가장 큰 종이 조각의 넓이가 몇 ㎠인지를 구하는 프로그램을 작성하시오.

입력
첫줄에는 종이의 가로와 세로의 길이가 차례로 자연수로 주어진다. 가로와 세로의 길이는 최대 100㎝이다. 둘째 줄에는 칼로 잘라야하는 점선의 개수가 주어진다. 셋째 줄부터 마지막 줄까지 한 줄에 점선이 하나씩 아래와 같은 방법으로 입력된다. 가로로 자르는 점선은 0과 점선 번호가 차례로 주어지고, 세로로 자르는 점선은 1과 점선 번호가 주어진다. 입력되는 두 숫자 사이에는 빈 칸이 하나씩 있다.

출력
첫째 줄에 가장 큰 종이 조각의 넓이를 출력한다. 단, 넓이의 단위는 출력하지 않는다.

예제 입력 1 
10 8
3
0 3
1 4
0 2
예제 출력 1 
30*/

//https://skygood95.tistory.com/50?category=913853

public class bj_2628 {
	static ArrayList<Integer> a,b;
	static int width,height,num;
	public static void main(String[] args) throws IOException {
		
			BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
			a=new ArrayList<Integer>();
			b=new ArrayList<Integer>();
			StringTokenizer st=new StringTokenizer(br.readLine());
			width=Integer.parseInt(st.nextToken());
			height=Integer.parseInt(st.nextToken());
			num=Integer.parseInt(br.readLine());
			for(int i=0;i<num;i++) {
				st=new StringTokenizer(br.readLine());
				int where=Integer.parseInt(st.nextToken());
				int k=Integer.parseInt(st.nextToken());
				if(where==1) {
					a.add(k);
				}else {
					b.add(k);
				}
			}
			Collections.sort(a);
			Collections.sort(b);
			int w=0;
			int start=0;
			for(int i=0;i<a.size();i++) {
				if(a.get(i)-start>w) {
					w=a.get(i)-start;
				}
				start=a.get(i);
			}
			if(width-start>w) {
				w=width-start;
			}
			int h=0;
			start=0;
			for(int i=0;i<b.size();i++) {
				if(b.get(i)-start>h) {
					h=b.get(i)-start;
				}
				start=b.get(i);
			}
			if(height-start>h) {
				h=height-start;
			}
			System.out.println(h*w);
		
	}

}
