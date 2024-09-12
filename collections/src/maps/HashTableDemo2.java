package maps;
import java.util.*;
public class HashTableDemo2 {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		map.put(101, "amit");
		map.put(102,"Sasi");
		map.put(103, "Surya");
		//Here, we specify the if and else statement as arguments of the method  
	     System.out.println(map.getOrDefault(101, "Not Found"));  
	     System.out.println(map.getOrDefault(105, "Not Found"));

	}

}
