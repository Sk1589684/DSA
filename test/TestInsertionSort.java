package com.demo.test;


import Sorting.InsertionSort;

public class TestInsertionSort {
public static void main(String[] args) {
	int [] arr= {25,7,2,1,10,8,3,9};
	
	InsertionSort.insertionSortAscending(arr);
	
	System.out.println("-------------------------------------------------");
	
//	System.out.println(Arrays.toString(arr));
	
	InsertionSort.insertionSortDescending(arr);
	
	System.out.println("-------------------------------------------------");
}


}
