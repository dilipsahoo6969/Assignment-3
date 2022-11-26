package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Secondquestion {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		System.out.println(marks);
		
		// Use of For each Loop
		for(int mar:marks) {
			System.out.println(mar);
		}
	}

}
