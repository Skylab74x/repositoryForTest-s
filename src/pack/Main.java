package pack;

public class Main {
    static void main(String[] args) {
        System.out.println(testText("<3<3<3"));
        popLover(3);
    }

    public static String testText(String text) {
        return "Hello GitHub" + text;
    }
    public static void popLover (int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("I love pop");
        }
    }
}
