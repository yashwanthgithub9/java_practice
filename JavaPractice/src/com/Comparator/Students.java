package com.Comparator;

public class Students  implements Comparable<Students>{
		
	int roll;
	String Name;
	
	public Students(int i, String string) {
		// TODO Auto-generated constructor stub
		this.Name=string;
		this.roll=i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return roll+" : "+Name;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		if (this.roll>o.roll) 
			return 1;
		else 
			return -1;
//		return 0;
	}

}
