package Bike;

public class StringBeautifier {

    public String ensureFullStop(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) != '.') {
            return str + ".";
        }
        return str;
    }

    public String capitalizeFirstLetter(String str) {
        if (str.length() > 0 && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public String beautify(String str) {
        str = capitalizeFirstLetter(str);
        str = ensureFullStop(str);
        return str;
    }

    public static void main(String[] args) {
        String input = "i love java";
        StringBeautifier beautifier = new StringBeautifier();
        System.out.println(beautifier.beautify(input));
    }
}
