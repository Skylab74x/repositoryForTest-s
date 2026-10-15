package pack;

public enum KazuyaAttacks {
    WIND_GOD_FIST(20, -10, 39, true, false),
    ELECTRIC_WIND_GOD_FIST(23,5,39, true, false),
    FLASH_PUNCH(22,-17, 30, false,true),
    DEMON_GOD_FIST(25,-26, 57, true, false);

    final int damage;
    final int framesOnBlock;
    final int framesOnHit;
    final boolean luncher;
    final boolean knockOut;

    KazuyaAttacks(int damage, int framesOnBlock, int framesOnHit, boolean luncher, boolean knockOut) {
        this.damage = damage;
        this.framesOnBlock = framesOnBlock;
        this.framesOnHit = framesOnHit;
        this.luncher = luncher;
        this.knockOut = knockOut;
    }
}
