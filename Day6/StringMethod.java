public class StringMethod {
    public static void main(String[] args) {
        String name = "devvSakib";
        name = "DevvSakib";
        String trimString = "   Devv    Sakib      ";
        // System.out.println(name.length());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.charAt(2));
        // System.out.println(trimString.trim());
        // System.out.println(name.substring(0));
        // System.out.println(name.substring(1, 5)); // evvS
        // System.out.println(name.replace('D', 'T'));
        // System.out.println(name.replace("v", "Dev"));
        // System.out.println(name.startsWith("D"));
        // System.out.println(name.endsWith("D"));
        // System.out.println(name.indexOf("v", 4));
        // System.out.println(name.lastIndexOf("v"));
        // System.out.println(name.equals("DevvSakib"));
        System.out.println(name.equalsIgnoreCase("devvSakib"));

        /*
         * string length = .length()
         * string hashcode = .hashCode()
         * string lowercase = .toLowerCase()
         * string uppercase = .toUpperCase()
         * char index in sting = .charAt()
         * remove whitespace from string(end,start) = .trim()
         * start from given index = .substring(x)
         * start from end, given index = .substring(x,y)
         * replace char in string = .replace(s1,s2)
         * string start with = .startWith(s) bool
         * string ends with = .endsWith(s) bool
         * char index in string = .indexOf("v")
         * start char index in string = .indexOf(s,2)
         * last char index in string = .lastIndexOf(s)
         * from last char index in string = .lastIndexOf(s, 4)
         * string equals = .equals(s) bool
         * string equals ignore case = .equalsIgnoreCase(s) 
         */
    }
}
