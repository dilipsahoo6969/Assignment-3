package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Firstquestion {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		System.out.println(marks);
		
		// Use of For Loop
		for(int i=0; i<marks.size();i++) {
			int mar = marks.get(i);
			System.out.println(mar);
		}
	}

}
