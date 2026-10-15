package pack;

import java.util.List;

public class Main {
    static void main(String[] args) {
        Opponent Jin = new Opponent(190);
        KazuyaMishima kazimir = new KazuyaMishima(Jin);

        kazimir.dealDamage(Jin, KazuyaAttacks.FLASH_PUNCH);
    }
}
