package pack;

public class Main {
    static void main(String[] args) {
        System.out.println(testText("fuck you"));
        popLover(3);
    }
    //max was here

    public static String testText(String text) {
        return "Hello GitHub" + text;
    }
    public static void popLover (int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("I love pop");
        }
    }
}
