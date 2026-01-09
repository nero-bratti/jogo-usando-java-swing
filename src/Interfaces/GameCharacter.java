package Interfaces;

import java.util.Random;

public interface GameCharacter {
    Random rand = new Random();
    Boolean tookDamageDidDie(int enemyDraws);
}
