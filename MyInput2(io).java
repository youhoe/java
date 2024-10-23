import java.io.*;

class MyInput2 {
    public static void main(String[] args) {
        try {
            // Initialize BufferedReader to read from standard input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter a character:");

            // Read a single character from input
            char c = (char) br.read();

            // Print the character
            System.out.println("You entered: " + c);
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
