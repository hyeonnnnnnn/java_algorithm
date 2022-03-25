package mijin.std_mijin.y_2022.mar_26;

import java.util.Scanner;

/*
李쎌쁺�씠�뒗 �떖�떖�빐�꽌 �샎�옄 �옱誘� �뾾�뒗 寃뚯엫�쓣 �븯�굹 �깮媛곹빐�깉�떎. �닽�옄 N�쓣 癒쇱� �젙�븯怨�, �씠 �닽�옄瑜� 2吏꾨쾿, 3吏꾨쾿, 4吏꾨쾿, ..., 100留뚯쭊踰�, 100留� 1吏꾨쾿 �벑�벑�쑝濡� 諛붽씀�뼱 蹂대㈃�꽌, 留덉�留됱옄由ъ뿉 �뿰�냽�맂 0�쓽 媛쒖닔瑜� 紐⑤몢 �뜑�븯�뒗 寃껋씠�떎.

�삁瑜� �뱾�뼱 N=5�씪硫�, 2吏꾨쾿 101, 3吏꾨쾿 12, 4吏꾨쾿 11, 5吏꾨쾿 10, 6吏꾨쾿 5, 7吏꾨쾿 5, ... �벑怨� 媛숈쑝誘�濡� �떟�� 1�씠 �맂�떎. �뿬�윭遺꾩씠 �븷 �씪�� 二쇱뼱吏� N�뿉 ���빐�꽌 李쎌쁺�씠媛� 援ы븳 �떟�쓣 李얜뒗 寃껋씠�떎. �젙�솗�엳 �꽕紐낇븯湲� �쐞�빐 �닔�븰�떇�쑝濡� �벐�옄硫�, f(N, b)瑜� N�쓣 b吏꾨쾿�쑝濡� �굹���깉�쓣 �븣 留덉�留됱뿉 �뵲瑜대뒗 �뿰�냽�맂 0�쓽 媛쒖닔濡� �젙�쓽 �븷 �븣

��
\[\sum_{b=2}^{\infty}{f(N, b)}\]��

瑜� 援ы븯�뒗 寃껋씠�떎.*/

public class bj_1975 {

	public static void main(String[] args) {
		int T;
		Scanner s = new Scanner(System.in);
		
		int num;
		int cv; //吏꾩닔 蹂��솚
		int sum=0 ; //珥�0 媛쒖닔 �빀
		
		T= s.nextInt();
		for(int i=0;i<T;i++) {
			num =s.nextInt();
			for(int t =2;t<=num;t++) {
				cv = convert(num,t); //吏꾨쾿蹂��솚
				sum+= countzero(Integer.toString(cv)); //0媛쒖닔 �꽭湲�
				
			}
			System.out.println(sum);
			sum=0;
		}
	}
	static int convert(int num,int c) {
		int tmp=0;
		int divnum=num;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			tmp = divnum % c;
			divnum = divnum/c;
		
			sb.insert(0, Integer.toString(tmp));
			if (divnum <c) {
				sb.insert(0, Integer.toString(divnum));
				break;
			}
		}
		//System.out.println(num+"�쓽"+c+"吏꾨쾿��"+sb.toString());
		return Integer.parseInt(sb.toString());
		
	}
	static int countzero(String num) {
		int sum =0; //0媛쒖닔 �뜑�븿
		for(int i =num.length()-1;i>=0;i--) {
			if (!(num.charAt(i) =='0'))
				break;
			sum+=1;
		}
		return sum;
	}

}
