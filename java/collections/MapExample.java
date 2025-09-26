package java.collections;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer,String> employees= new HashMap<>();
		
		//put()
		employees.put(101, "jhon");
		employees.put(102, "alice");
		employees.put(103, "bob");
		System.out.println("Employees: " + employees); // {101=jhon,102=alice,103=bob}
		
		//get(key)
		System.out.println("Employee 101: " + employees.get(101));//jhon
		
		//remove(key)
		employees.remove(103);
		System.out.println("after removing 103: " + employees); //{101=jhon, 102=alice}
		
		//containsKey(key)
		System.out.println("HAs key 101? " + employees.containsKey(101)); //true
		
		//size()
		System.out.println("size: " + employees.size()); //2
		
		//isEmpty()
		System.out.println("Is empty? " + employees.isEmpty()); //false
		
		//keySet()
		System.out.println("Keys: " + employees.keySet()); //[101,102]
		
		//values()
		System.out.println("values: " + employees.values()); //[jhon,Alice]
		
		//entrySet()
		System.out.println("Iterating entries: ");
		for(Map.Entry<Integer, String>entry: employees.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: "+entry.getValue());
		}

	}

}
