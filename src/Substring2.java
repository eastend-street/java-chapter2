public class Substring2 {
    public static void main(String[] args) {
        String str = "This is java computer science A lab";
        String substr = "";

        substr = str.substring(7, 21);
        System.out.println("substring = " + substr);
        substr = str.substring(0, 7);
        System.out.println("substring = " + substr);
    }
}