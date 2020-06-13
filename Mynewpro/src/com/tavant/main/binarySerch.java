package com.tavant.main;

public class binarySerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 4, 5,3, 9, 12 };
		int x=5;
		System.out.println("index "+serch(arr,x));

	}
	public static int fact(int x){
		return -1;
	}

	public static int serch(int[] arr,int x) {
		
		int l = 0;
		int r = arr.length-1;
		
		
		
		while (l <= r) {
			
			int mid = l + (r - l) / 2;
			if(arr[mid]==x)
				return mid;
			
			if(arr[mid]>x){
				r=mid-1;
			}else{
				l=mid+1;
			}
			
			
		}
		return -1;
	}

}
