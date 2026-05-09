package com.demo.test;



import java.util.Arrays;

import Sorting.HeapSortAlgorithm;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {2,9,7,4,1,8,4};
		HeapSortAlgorithm.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));

	}

}
