package Java_Pract;
import java.util.*; 

public class ArrayLi {

	public static void main(String[] args) {
		
	  
		
		List arr1=new ArrayList();
		//ArrayList<String> arrl=new ArrayList<String>();  
		arr1.add(22);  
		arr1.add("Venky");  
		arr1.add("Mani");  
		arr1.add(1,"Harish");  
		
		System.out.println(arr1.size());
		
		System.out.println("Element at 2nd position: "+arr1.get(3));  
		
		for(Object s:arr1){  
		 System.out.println(s);  
		}  
		
		
		
		
		//
		  ArrayList<String> arr2=new ArrayList<String>();  
		  arr2.add("Baji");  
		  arr2.add("Venky");  
		  arr2.add("Mani");  
		  arr2.add(1,"Harish");   
		  ArrayList<String> arr3=new ArrayList<String>();  
		  arr3.add("Vamshi");  
		  arr3.add("Sathish");  
		  
		//adding second list in first list 
		  arr2.addAll(arr3); 
		  Iterator itr=arr2.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}  
	

}


