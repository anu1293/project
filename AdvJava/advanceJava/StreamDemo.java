package advanceJava;

import java.util.ArrayList;
import java.util.List;
/*The below program generates random numbers less than 1000 and generates the word representation
 * of only those numbers which are multiples of five
 * */
public class StreamDemo {
	
	List<Integer> list=new ArrayList<>();
	
	
	void populateList(int n){
		list.clear();
		if(n>1){
			for(int i=1;i<n;++i){
				list.add((int) (Math.random()*1000));
			}
		}
	}
	
	void displayList(){
		list.forEach(System.out::println);
	}

	static String convert(int n){
		final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	    final String[] tens = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	    };

	
		if (n < 0) {
			return "Minus " + convert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		return null;
	}
	
	public static void main(String[] args) {
		StreamDemo m=new StreamDemo();
		
		m.populateList(10);
		m.displayList();
		
		
		
		//Multiples of 5
		m.list.stream().filter(i -> i%5==0).forEach(System.out::println);

		
		//3.2
		System.out.println("Conversion to String");
		m.list.stream().filter(i -> i%5==0).map(s->convert(s)).forEach(System.out::println);
	}

}

