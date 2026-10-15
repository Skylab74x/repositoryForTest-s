package pack;

public class KazuyaMishima implements Movement {
    private int HP = 190;

    public void hit () {
        System.out.println("Kazuya Mishima ydaril nah");
    }

    @Override
    public void getHit(int hitDamage) {
        System.out.println("Kazuya Mishima poluchil v eblo");
        takeDamage(hitDamage);
    }

    private void takeDamage(int damage) {
        System.out.println("-" + damage);
        HP-=damage;
        if (HP <= 0) {
            dead();
        }
    }

    private void dead() {
        System.out.println("YOU ARE DEAD");
    }
    public void showHP(){
        System.out.println("HP: " + HP);
    }
}
