public class PalidromeCheck {

    public static boolean isPalidrome(String word){
        if(word.contains(",")){
            word = word.replace(",", "");
        }
        if(word.contains(" ")){
            word = word.replace(" ", "");
        }
        word = word.toLowerCase();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalidrome("racecar"));
    }
}
