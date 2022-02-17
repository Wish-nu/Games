package com.game;

public class Main {

    public static void main(String[] args) {

        Player1 player = new Player1("Jackson", "sword", 100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());
//
        player.damageByGun1();      //health reduced by 30
        player.damageByGun1();      // health reduced by 30
        player.damageByGun2();      //health reduced by 50, player dead
        player.heal();

        Player2 betterPlayer = new Player2("Roger","AK47", 80, false);
        betterPlayer.damageByGun1();
        betterPlayer.damageByGun1();
        betterPlayer.damageByGun2();
        player.heal();





    }
}
