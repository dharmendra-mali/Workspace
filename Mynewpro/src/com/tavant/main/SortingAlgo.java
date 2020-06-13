package com.tavant.main;

public class SortingAlgo {

	public static void main(String[] args) {
		int[] n = { 9, 3, 1, 7 };
		System.out.println("befor sort \n ");
		show(n);
		System.out.println();
		n = insertionSort(n);

		System.out.println("After sort \n ");
		show(n);
	}

	public static void show(int[] n) {
		for (int x : n) {
			System.out.print(x + " ");

		}
		System.out.println();
	}

	public static int[] bubuleSort(int[] n) {
		int x;
		for (int i = 0; i < n.length - 1; i++) {

			for (int j = 0; j < n.length - 1 - i; j++) {
				if (n[j] > n[j + 1]) {
					x = n[j];
					n[j] = n[j + 1];
					n[j + 1] = x;
				}
			}
		}

		return n;
	}

	public static int[] selectionSort(int[] n) {
		int x, min;
		for (int i = 0; i < n.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[min]) {
					min = j;

				}
			}
			System.out.println(min);
			x = n[min];
			n[min] = n[i];
			n[i] = x;
			show(n);
		}

		return n;
	}

	public static int[] insertionSort(int[] n) {
		int x;
		for (int i = 1; i < n.length; i++) {
			int j = i - 1;
			x = n[i];
			while (j > -1 && n[j] > x) {
				n[j + 1] = n[j];
				j--;
			}
			n[j + 1] = x;

		}

		return n;
	}
}
