package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(4);// duplicates are allowed
		arrayList.add(6);
		System.out.println(arrayList);
		
		
		HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicates are not allowed // 
        //stores in sorted array
        System.out.println("HashSet : " + set);   
	}

}
