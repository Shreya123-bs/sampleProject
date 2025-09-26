package java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String>fruits = new ArrayList<>();
		
		//add()
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		System.out.println("fruits: " + fruits);//[Apple,Banana,Mango]
		
		//add(index, element)
		fruits.add(1,"Orange");
		System.out.println("After adding at  index 1: " + fruits); //[apple,orange,banana,mango]
		
		
		//get[index]
		fruits.get(2);
		System.out.println("fruit at index 2: "+fruits.get(2));
		
		//set(index,element)
		fruits.set(2, "grapes");
		System.out.println("after replacing index 2 : "+ fruits);//[orange,grapes,mango]
		
		
		//remove(index)
		fruits.remove("mango");
		System.out.println("after removing index 0: " + fruits); //[orange,grapes]
		
		
		//remove(object)
		fruits.remove("Mango");
		System.out.println("after removing mango: "+ fruits);//[orange,grapes]
		
		
		//size()
		System.out.println("size: " +fruits.size());//2
		
		//contains(object)
		System.out.println("contains grapes? " +fruits.contains("grapes"));//true
		
		//isEmpty()
		System.out.println("is list empty ? " +fruits.isEmpty());//false


		//indexOf(Object)
		System.out.println("index of  grapes: " +fruits.indexOf("grapes"));//1

		
		//lastIndexOf(Object)
		fruits.add("orange");
//		System.out.println("fruits: " +fruits)); //[orange,grapes,orange]
		System.out.println("last index of orange : " + fruits.lastIndexOf("orange")); //2
		
		//clear()
		 fruits.clear();
	        System.out.println("after clear : " + fruits);//[]
	}

}
