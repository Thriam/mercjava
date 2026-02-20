package org.chain.game;

public class GameDemo {

    public static void main(String[] args) {
        AttackHandler shield = new Shield();
        AttackHandler armor = new Armor();
        AttackHandler magic = new MagicBarrier();

        // Create chain of responsibility
        shield.setNext(armor);
        armor.setNext(magic);

        System.out.println("Enemy attacks with 50 damage!");

        // Start the chain
        shield.handleAttack(50);
    }
}
