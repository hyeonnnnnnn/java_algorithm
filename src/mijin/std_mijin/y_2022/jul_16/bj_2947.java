package mijin.std_mijin.y_2022.jul_16;

import java.util.Scanner;

public class bj_2947 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int [] arr= new int[5];
		int  tmp=0;
		
		for(int i=0;i<5;i++)
			arr[i] = s.nextInt();
		//Á¤·Ä
		for(int i=0;i<5-1;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] =arr[j];
					arr[j] = tmp;
					printarr(arr);
				}		
			}
		}
	}

	static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
}
