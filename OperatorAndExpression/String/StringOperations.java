public class StringOperations {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        
        // Concatenation
        String concatStr = str + " How are you?";
        System.out.println("Concatenation: " + concatStr);

        // Length
        int length = str.length();
        System.out.println("Length: " + length);

        // Substring
        String subStr = str.substring(2, 7);
        System.out.println("Substring: " + subStr);

        // Comparison
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Equals: " + isEqual);

        // Case Conversion
        String upperStr = str.toUpperCase();
        String lowerStr = str.toLowerCase();
        System.out.println("Uppercase: " + upperStr);
        System.out.println("Lowercase: " + lowerStr);

        // Trim
        String trimmedStr = str.trim();
        System.out.println("Trimmed: " + trimmedStr);

        // Replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced: " + replacedStr);

        // Split
        String[] splitStr = str.split(",");
        System.out.println("Split:");
        for (String s : splitStr) {
            System.out.println(s.trim());
        }
    }
}
