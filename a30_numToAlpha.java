public class a30_numToAlpha {
    public static void main(String[] args) {
        int i = 23; // input number
        if(i >= 1 && i <= 26) {
            char ch = (char)('A' + i - 1);
            System.out.println(i + " - " + ch);
        } else {
            System.out.println("Invalid input! Enter number between 1 to 26.");
        }
    }
}
