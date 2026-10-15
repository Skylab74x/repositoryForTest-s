package pack;

public class Main {
    static void main(String[] args) {
        KazuyaMishima kazuyaMishima = new KazuyaMishima();

        kazuyaMishima.hit();
        kazuyaMishima.getHit(25);
        kazuyaMishima.showHP();
        kazuyaMishima.getHit(100);
        kazuyaMishima.showHP();
        kazuyaMishima.getHit(70);
    }
}
