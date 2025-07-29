public class HelloWorld {
    public static void main(String[] args) {
        String message = "hello world";
        System.out.println(message);
        
        // Count characters using a for loop
        int characterCount = 0;
        for (int i = 0; i < message.length(); i++) {
            characterCount++;
        }
        System.out.println("Number of characters: " + characterCount);
    }
}
