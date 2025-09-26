package java.collections;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		Set<String>names=new HashSet<>();
		
		//add()
		names.add("satya");
		names.add("anki");
		names.add("shreya");
		names.add("satya"); // duplicate ignored
        System.out.println("Name: " + names); //[satya,anki,shreya]//order nt guranteed

//remove(object)
        names.remove("anki");
        System.out.println("after removing anki : " + names);//[satya,shreya]
        
        //contains(object)
        System.out.println("contains satya? : " + names.contains("satya")); //true

// size()
        System.out.println("size: " + names.size()); //2
        
        //isEmpty()
        System.out.println("is Empty : " + names.isEmpty());//false

        //clear()
        names.clear();
        System.out.println("after clear : " + names);//[]

        

	}

}
