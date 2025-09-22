package com.Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortByComparator {

	public static void sortlist(List<Students> l) {
		// TODO Auto-generated method stub
		
	
	Comparator<Students> com= new Comparator<Students>() {
		
		@Override
		public int compare(Students o1, Students o2) {
			// TODO Auto-generated method stub
			if (o1.roll%10>o2.roll%10) {
				return 1;
			}
			else 
				return -1;
//			return 0;
		}
	};
	System.out.println("After sort using comparator based on last digit");
	Collections.sort(l, com);

	}

}
