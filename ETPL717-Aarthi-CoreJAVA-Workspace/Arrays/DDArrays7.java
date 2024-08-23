package com.evergent.corejava.Arrays;
public class DDArrays7 {
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				if(i==j){
					a[i][j]=7;
					System.out.print(a[i][j]);
				}
				else if(i+j==4){
					a[i][j]=7;
					System.out.print(a[i][j]);
				}
				else {
				a[i][j]=0;
				System.out.print(a[i][j]);
			}			
			}
		}
	}
}



