package customise_trim;

public class Main {

    public static void main(String[] args) {
        String str = "  And do good as Allah has done good to you ";
        String customTrim = customTrim(str);
        System.out.println(customTrim);
    }

    public static String customTrim(String string){
        int firstIndex = 0;
        int lastIndex = string.length() - 1;

        while (firstIndex < string.length() && string.charAt(firstIndex) == ' ') {
            firstIndex++;
        }

        while (lastIndex >= 0 && string.charAt(lastIndex) == ' ') {
            lastIndex--;
        }


        if (firstIndex > lastIndex) {
            return "";
        }

        return string.substring(firstIndex, lastIndex + 1);
    }
}
