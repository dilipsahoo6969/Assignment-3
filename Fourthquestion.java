package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Fourthquestion {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		System.out.println(marks);
		
		int sum = 0;
		
		for(int i=0; i<marks.size(); i++) {
			sum = sum + marks.get(i);
		}
		System.out.println("Summation of elements present in the List is: "+sum);
	}

}
