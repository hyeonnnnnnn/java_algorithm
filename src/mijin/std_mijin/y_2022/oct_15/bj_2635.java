package mijin.std_mijin.y_2022.oct_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//https://skygood95.tistory.com/48


public class bj_2635 {
	static int max,n;
	static ArrayList<Integer> result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		for(int i=n/2;i<=n;i++) {
			go(i);
		}
		System.out.println(max);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<result.size()-1;i++) {
			sb.append(result.get(i));
			sb.append(" ");
		}
		sb.append(result.get(result.size()-1));
		System.out.println(sb);

	}

	private static void go(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(n);
		a.add(i);
		while(true) {
			int pre=a.get(a.size()-2);
			int now=a.get(a.size()-1);
			if(pre-now>=0) {
				a.add(pre-now);
			}
			else
				break;
		}
		if(max<a.size()) {
			result=new ArrayList<Integer>();
			for(int j=0;j<a.size();j++) {
				result.add(a.get(j));
			}
			max=a.size();
		}
	}
}
