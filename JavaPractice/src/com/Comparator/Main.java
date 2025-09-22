package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> l= new ArrayList<Students>();
		l.add(new Students(37,"Dhoni"));
		l.add(new Students(51,"Rahul"));
		l.add(new Students(45,"Rohit"));
		l.add(new Students(18,"Virat"));
		l.add(new Students(33,"hardik"));
		l.add(new Students(17,"rishab"));
		for (Students students : l) {
			System.out.println(students);
		}
		Collections.sort(l);
		System.out.println("After Sorting using comparable based on roll");
		for (Students students : l) {
			System.out.println(students);
		}
		sortByComparator.sortlist(l);
		for (Students students : l) {
			System.out.println(students);
		}
	}

}
