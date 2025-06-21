public class a4_titleCase {
    public static void main(String[] args) {
        String str = "hare krishna hare ram";
        String ans = title(str);
        System.out.println(ans);
    }

    public static String title(String str) {
        String words[] = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                ans.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return ans.toString().trim();
    }
}
