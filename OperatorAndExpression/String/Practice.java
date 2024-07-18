public class Practice {
    public static void main(String[] args) {
        String str = "Hello Jitu";
        //concentration
        String concatStr = str + "How are you?";
        System.out.println("concatenation" + concatStr);

        int length = str.length();
        System.out.println(length);

            String subString = str.substring(2, 7);

        // comparison
        boolean isEqual = str.equals("Hello Raj!");
        System.out.println("Equal" + isEqual);

        // Case conversion
        String upperStr = str.toLowerCase();
        String loweStr  = str.toUpperCase();

        System.out.println("Uppercase: "+ upperStr);
        System.err.println("Lowercase: " + loweStr);

        // Trim
        String trimmedStr = str.trim();
        System.out.println("Trimmed:" + trimmedStr);

        String replacedStr = str.replace("Word", "java");
        System.out.println("Replaced:" + replacedStr);

        // Split
        String[] splitStr = str.split(",");
        System.out.println("Split");
        for(String s : splitStr){
            System.err.println(s.trim());
        }

    }
    
}