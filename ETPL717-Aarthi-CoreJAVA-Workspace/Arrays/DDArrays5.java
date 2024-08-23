package com.evergent.corejava.Arrays;
public class DDArrays5 {
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				a[i][j]=7;
				System.out.print(a[i][j]);
			}
		}
	}
}


