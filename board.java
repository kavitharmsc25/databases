interface StringFunction { 
String run(String str); 
} 
public class board
{ 
public static void main(String[] args) { 
 StringFunction exclaim = (s) -> s + "!"; 
StringFunction ask = (s) -> s + "?"; 
printFormatted("Hi Welcome", exclaim); 
printFormatted("Interested in Computer Courses ", ask); 
} 
public static void printFormatted(String str, StringFunction format) { 
String result = format.run(str); 
System.out.println(result); 
} 
}