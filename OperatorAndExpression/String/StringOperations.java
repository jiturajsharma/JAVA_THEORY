public class StringOperations {
    public static void main(String[] args) {
        
        String str = "Raj";
        // concentration
        String concatString = str + "is Hero";
        System.out.println("concatenation" + concatString);

        int length = str.length();
        System.out.println(length);

        // String subString = str.substring(4, 6);

        // comparison
        boolean isEqual = str.equals("Maj");

        System.out.println("Equal : -" + isEqual);

        String upperString = str.toLowerCase();
        String lowerCase = str.toUpperCase();

        System.out.println(upperString);
        System.out.println(lowerCase);

        String trimmedStr = str.trim();
        System.out.println("Trimmed: " + trimmedStr);
        System.out.println(trimmedStr);

        String replaceStr = str.replace("Raj", "How are you" );

        System.out.println("Replaced:" +replaceStr);

        String[] splitStr = str.split(",");
        System.out.println("Split");
        for(String s : splitStr){
            System.out.println(s.trim());
        }

    }    
}

