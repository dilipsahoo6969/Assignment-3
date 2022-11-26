package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Thirdquestion {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		System.out.println(marks);
		
		// Use of Iterator
		Iterator<Integer> mar = marks.iterator();
		while(mar.hasNext()) {
			int a = mar.next();
			System.out.println(a);
		}
	}

}
