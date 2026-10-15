package pack;

public class KazuyaMishima extends Character {

    Opponent opponent;

    public KazuyaMishima(Opponent opponent) {
        if (opponent == null) {
            throw new IllegalArgumentException("There must be opponent");
        }

        this.opponent = opponent;
    }

    public void dealDamage(Opponent opponent, KazuyaAttacks attack) {
        opponent.HP -= attack.damage;

        if (attack.luncher) {

            combo();
        } else if (attack.knockOut) {
            followUp();
        }

        isLose();
    }

    @Override
    public void combo() {
        System.out.println("you in combo bro :(");
        opponent.HP -= 70;
        showHP();
    }

    @Override
    void followUp() {
        opponent.HP -= 34;
        showHP();
    }

    void isLose(){
        if (opponent.HP <= 0) {
            youLose();
        }
    }
    void showHP() {
        System.out.println("HP: " + opponent.HP);
    }
}
