package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Sixthquestion {

	public static void main(String[] args) {
		List<Integer> mar3 = new ArrayList<>();
		mar3.add(33);
		mar3.add(44);
		mar3.add(55);
		mar3.add(66);
		mar3.add(77);
		mar3.add(88);
		System.out.println(mar3);
		mar3.remove(1);
		System.out.println(mar3);
		mar3.add(3,90);
		System.out.println(mar3);
		System.out.println(mar3.size());
		
		int[] arr = new int[mar3.size()];
		for(int i=0; i<mar3.size();i++) {
			arr[i] = mar3.get(i);
		}
		
		//printing elements of array
		//using for each loop
		for (int x:arr) {
			System.out.print(x+ " ");
		}
	
}
}
