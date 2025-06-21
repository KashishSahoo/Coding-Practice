
public class a31_alphatoNum {
    public static void main(String[] args) {
        char ch = 'G';  // take one character input

        // Convert to uppercase or lowercase to standardize
        ch = Character.toUpperCase(ch); // or Character.toLowerCase(ch)

        if(ch >= 'A' && ch <= 'Z') {
            int position = ch - 'A' + 1;
            System.out.println(ch + " - " + position);
        } else {
            System.out.println("Invalid input! Please enter an English alphabet (A-Z or a-z).");
        }
    }
}
