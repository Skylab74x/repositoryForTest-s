package pack;

public class Attack {
    private final String name;
    private final int damage;
    private final int framesOnBlock;
    private final int framesOnHit;
    private final boolean luncher;
    private final boolean knockOut;

    public Attack(String name, int damage, int framesOnBlock, int framesOnHit, boolean luncher, boolean knockOut) {
        this.name = name;
        this.damage = damage;
        this.framesOnBlock = framesOnBlock;
        this.framesOnHit = framesOnHit;
        this.luncher = luncher;
        this.knockOut = knockOut;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getFramesOnBlock() {
        return framesOnBlock;
    }

    public int getFramesOnHit() {
        return framesOnHit;
    }

    public boolean isLuncher() {
        return luncher;
    }

    public boolean isKnockOut() {
        return knockOut;
    }
}
