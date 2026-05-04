import java.util.LinkedHashSet;
import java.util.Set;

public class HelloWorld {

	public void add() {
		int a = 10;
		int b = 15;
		int c = a + b;
		System.out.println("The addition of a and b is " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h = new HelloWorld();
		h.add();
		
		// split
		String s = "a,b,c";
		String[] arr = s.split(",");
		for (String str : arr) {
			System.out.println(str); //abc
		}
		
		// length
		
		String s1 = "Hello";
		System.out.println(s1.length()); //5
		
		// isEmpty - boolean
		System.out.println(s1.isEmpty()); //false
		
		// isBlank - boolean
		System.out.println(s1.isBlank()); // false
		
		// toUpperCase and toLowerCase
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		// equals - boolean
		String s2 = "hello";
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		// compareTo
		System.out.println(s1.compareTo(s2));
		
//Searching		
		
		// contains - boolean
		System.out.println(s1.contains("llo")); // true
		
		// startsWith and endsWith - boolean
		System.out.println(s1.startsWith("He")); // true
		System.out.println(s1.endsWith("lo")); // true
		
		// indexOf and lastIndexOf - index number
		System.out.println(s1.indexOf('l')); //2
		System.out.println(s1.lastIndexOf('e')); //1
		
// Extraction
		
		// substring
		System.out.println(s1.substring(1, 3)); // el
		
		// charAt
		System.out.println(s1.charAt(3)); //l
		
// Modification
		
		// concat
		System.out.println(s1.concat("World")); // helloWorld
		
		// replace
		System.out.println(s1.replace('e', 'a')); // hallo
		
		// replaceAll
		System.out.println(s1.replaceAll("\\d", ""));
		
		// replaceFirst
		String s3 = "  helloworld  ";
		System.out.println(s3.replaceFirst("l", "a"));
		
		// trim
		System.out.println(s3.trim());
		System.out.println(s3.strip());
		
		// join 
		String result = String.join("-", "A","B","C");
		System.out.println(result);
		
		// valueOf
		int num = 10;
		String st = String.valueOf(num);
		System.out.println(st);
		
		//toCharArray
		char[] array = "Java".toCharArray();
		System.out.println(array);
		
		//format
		String str1 = String.format("My age is %d", 25);
		System.out.println(str1);
		
		// repeat
		System.out.println("Hi ".repeat(4));
		
		// Interning
		String str2 = new String("Java");
		String str3 = str2.intern();
		System.out.println(str3);
		}

}
