package allbasic;

import java.util.Scanner;

class Solution {
	public static void twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (target == (nums[i] + nums[j])) {
					System.out.println("[" + i + "," + j + "]");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);		 
		int[] array = new int[3];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<array.length; i++)  
		{  
 		array[i]=obj.nextInt();  
		}  
	    int target = obj.nextInt();
	    twoSum(array, target);
	}
 }

