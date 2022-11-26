package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Fifthquestion {
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30};
		List<Integer> mar2 = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			mar2.add(arr[i]);
		}
		System.out.println("The List after adding element from Array "+mar2);
	}

}
