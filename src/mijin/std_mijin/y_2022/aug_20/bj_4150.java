package mijin.std_mijin.y_2022.aug_20;

import java.math.BigInteger;
import java.util.Scanner;

/*
臾몄젣
�뵾蹂대굹移� �닔�뿴�� �떎�쓬怨� 媛숈씠 洹� �쟾 �몢 �빆�쓽 �빀�쑝濡� 怨꾩궛�릺�뒗 �닔�뿴�씠�떎. 泥� �몢 �빆�� 1濡� �젙�쓽�맂�떎.

f(1) = 1, f(2) = 1, f(n > 2) = f(n �닋 1) + f(n �닋 2)

�젙�닔瑜� �엯�젰諛쏆븘, 洹몄뿉 �빐�떦�븯�뒗 �뵾蹂대굹移� �닔瑜� 異쒕젰�븯�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦�븯�뿬�씪.

�삁�젣 �엯�젰 1 
100
�삁�젣 異쒕젰 1 
354224848179261915075
�엺�듃*/

public class bj_4150 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		BigInteger f[] = new BigInteger [N+1];
		f[0] = BigInteger.valueOf(0);f[1] =BigInteger.valueOf(1); f[2]=BigInteger.valueOf(1);
		
		for(int i=3;i<N+1;i++) {
			f[i] = f[i-1].add(f[i-2]);
			System.out.println(i+" "+f[i]);
		}
		System.out.println(f[N]);
		

	}

}
