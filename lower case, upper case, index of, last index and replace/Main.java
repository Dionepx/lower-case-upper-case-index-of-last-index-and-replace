public class Main {
     public static void main(String[] args) {
 
         String original = "ABC";
 
         String s01 = original.toLowerCase();
         String s02 = original.toUpperCase();
         String s03 = original.substring(2);
         String s04 = original.substring(0, 2);
         String s05 = original.replace('A','Z'); // quando encontrar um A, substitua por um Z
         int i = original.indexOf("B");
         int j = original.lastIndexOf("W");
 
         System.out.println("Original: -" + original + "-");
         System.out.println("Lower Case: -" + s01 + "-");
         System.out.println("Upper Case: -" + s02 + "-");
         System.out.println("substring(2): -" + s03 + "-");
         System.out.println("substring(0, 1): -" + s04 + "-");
         System.out.println("replace('A', 'Z'): -" + s05 + "-");
         System.out.println("Index da letra 'W': " + i);
         System.out.println("Último index: " + j);
     }
 }