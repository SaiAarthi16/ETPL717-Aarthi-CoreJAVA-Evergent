package com.evergent.corejava.Arrays;
public class DDArrays9 {
	public static void main(String[] args) {
		String a[][]=new String[5][5];
		for(int i=0;i<5;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
					a[i][j]="JAVA";
					System.out.print(a[i][j]+" ");
			}
		}
	}
}