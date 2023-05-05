package Java_Pract;

import java.util.Arrays;

public class Srings {

	public static void main(String[] args) {
		String str1 = "Hello Shaik Baji ";
		
		//split(str1);
		
		//System.out.println(length(str1));
		
		//index();
		strinCompare();
		

	}
	
	//Split The one Sting i to two
	 public static void split(String str1)
	 { 
	 
	 String str1Array[] = str1.split(" "); 
	 
	 System.out.println("String with single empty space: " + Arrays.toString(str1Array)); 
	 
	 
	 String str2 = "i am Baji    Shaik"; 
	 String str2Array[] = str2.split(" "); 
	 System.out.println("String with 4 spaces between Baji and Shaik: " + Arrays.toString(str2Array)); 
	 }
	 
	 //find the length of the string
	 public static int length(String st) {
		 
		 int length=st.length();
		 
		 return length;
	 }
	 
	 public static void index(){
		 String str = "ABCABCABC"; // index numbering starts form zero
		 // 1st overloaded method
		 int x = str.indexOf('B');
		 System.out.println("B index position in str from 0 position: " + x); 
		// 2nd overloaded method
		 System.out.println("B index position in str from index position 2: " + str.indexOf('B', 2));
		// 3rd overloaded method
		 System.out.println("\nCAB index position in str from 0 position: " + str.indexOf("CAB")); 
		// 4th overloaded method
		 System.out.println("CAB index position in str from 3 position: " + str.indexOf("CAB", 3)); 
		 System.out.println("\nK index position in str from index position 0: " + str.indexOf('K'));
		 }
	 public static void strinCompare(){
		 String s1="Baji";
		 String s2="Baji";
		 String s3="Afshan";
		 String s4=new String("Afshan");
		 String s5="shannu";
		 System.out.println("s1(Baji).== s2(Baji)--           "+(s1==s2));
		 System.out.println("s1(Baji).equals (s2(Baji))-      "+s1.equals(s2));
		 System.out.println("s3(Afshan). == new s4(Afshan)--  "+(s3==s4));
		 System.out.println("s3(Afshan).equals( s4(Afshan))-- "+s3.equals(s4));
		 
	 }
	 
	 



}
	 
