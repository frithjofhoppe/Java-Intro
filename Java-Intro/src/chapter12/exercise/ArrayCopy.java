package chapter12.exercise;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {2,6,9,8,2};
		int[] arr2;
		
		arr2 = Arrays.copyOf(arr1, arr1.length);
		
		for(int i = 0; i < arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
	}

}
