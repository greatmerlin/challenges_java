package lesson28;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// arrays
		String[] myStringArray = new String[10];
		int[] myIntArray = new int[10];
		
		// ArrayList
		
		ArrayList<String> theNames = new ArrayList<String>();
		theNames.add("theo");
		
		//ArrayList<int> theIntegers = new ArrayList<int>();

		ArrayList<intClass> therealIntegers = new ArrayList<intClass>();
		
		therealIntegers.add(new intClass(20));
		
		// that would work, but its a little bit messy
		
		// the way of java helping us with that, is the Autoboxing. It provides us with wrapper Classes. It wraps the primitive types inside classes, so that we can use them
		//in cases like this one
		//but maybe, you see the String there and you wonder, it is a primitive class, why is it working?
		//but actually String is a class
		//if you check what we did above, we actually created a wrapper class.
		
		// so in java there are classes like:
		
		Integer myInt = new Integer(20);
		Double myDouble = new Double(12.5);
		
		ArrayList<Integer> intArray = new ArrayList<>();
		
		for(int i=0; i <= 10; i++) {
			intArray.add(Integer.valueOf(i)); // the valueOf turns the int to an Object of the Integer Class (Autoboxing)
		}
		
		// to print them back
		
		for(int i = 0; i <= 10; i ++) {
			System.out.println("The number " + i + " = " + intArray.get(i).intValue());   // get an Int Class and turn it to int Value (Unboxing)
		}
		
		// java makes it even easier for us
		
		Integer aNumber = 10;  // at compile time it is like: Integer.valueOf(number); -> this is an object of the class integer -> autoboxing
		
		int anIntNumber = aNumber;  // you don't need to write sth more. -> unboxing -> actually -> aNumber.intValue();
		
		System.out.println();
		
		// an example
		
		ArrayList<Integer> myList = new ArrayList<>();
		
		for(int i = 0; i <= 10; i++) {
			myList.add(i);               // add(Integer.valueOf(i)
		}
		
		for(int i = 0; i < myList.size(); i++) {
			int value = myList.get(i);   // get(i).IntegerValue();
			System.out.println(value);
		}
		
		
		
		
		
	}

}
