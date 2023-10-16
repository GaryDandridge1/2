public class StringReverse {
    public static void main(String[] args) {
        String word = "Hello, World";
        String Stringreversed = new StringBuilder(word).reverse().toString();
        System.out.println(Stringreversed);
        if(word != Stringreversed) {
            System.out.println(" The String are not equal and boolean expression " + word.equals(Stringreversed) +"!");
        }
        else{
            System.out.println( word + "is equal to " + Stringreversed + "!");

        }
    }
}