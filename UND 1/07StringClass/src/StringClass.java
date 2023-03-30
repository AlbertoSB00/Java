public class StringClass {

    public static void main(String[] args) {
        // Create a new string
        String myString = "This is a string";
        System.out.println("1º- The string is: " + myString);

        // The String class has got many constructors
        char arrayChars[] = {'J', 'a', 'v', 'a'};
        String language = new String(arrayChars);
        System.out.println("2º- We are programming with " + language);

        // To create a copy from a string
        // String copyLanguage = language;        This way is not correct
        String copyLanguage = new String(language);
        System.out.println("3º- The copy is " + copyLanguage);

        // Let's calculate the string length
        System.out.println("4º- The length of language is " + language.length());

        // String concatenation
        String name = "John";
        String surname = "Miller";
        System.out.println("5º- " + name + " " + surname);
        String fullName = name.concat(surname);
        System.out.println("6º- " + fullName);
        // Strings are immutable they don't change
        System.out.println("7º- " + name);
        System.out.println("8º- " + surname);

        // To convert a primitive data to String 
        // We can use the + operator
        int number = 85;
        String number85 = number + "";

        //There are several valuesOf() methods in String class
        // to convert primitive data.
        number85 = String.valueOf(number);
        System.out.println("9º- The number is " + number85);

        String piNumber = name.valueOf(3.141598);
        System.out.println("9º- The pi number is " + piNumber);
        
        // Extracting characters from a string
        myString = "Don't worry, be happy!";
        char character = myString.charAt(9);
        System.out.println("10º- The position 9 is " + character);

        // Let's get the characters at odd position
        int number1 = 10; //Decoration by the author
        for( int i = 1; i < myString.length(); i+=2) {
            number1 += 1;
            System.out.println(number1 + "º Character at position " + i + " is " + myString.charAt(i));
        }

        // getChars() method
        int begin = 4, end = 10;
        char charArray[] = new char [end - begin];
        myString.getChars(begin, end, charArray, 0);
        System.out.print("22º- ");
        System.out.println(charArray);

        // Comparing strings
        String s1 = "ABCDefg";
        String s2 = "ABCDEfg";
        if( s1.equals(s2) ) System.out.println("23º- S1 and S2 are equal");
        else System.out.println("23º- S1 abd S2 are different");

        if( s1.equalsIgnoreCase(s2) ) System.out.println("24º- S1 and S2 are equal");
        else System.out.println("24º- S1 abd S2 are different");

        int result = s1.compareTo(s2);
    	}
}