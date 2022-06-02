package Game1;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome in the shooting game");
        System.out.println("Button for player of team1");
        int option1 = 0;
        System.out.println("press 1 for choosing player ");
        System.out.println("press 2 for choosing gun");
        System.out.println("press 3 for using gun1");
        System.out.println("press 4 for using gun2");
        System.out.println("press 5 for using strengthbooster");
        System.out.println("press 6 for exit game");

        System.out.println("Button for player of team2");
        int option2 = 0;
        System.out.println("press 7 for choosing player ");
        System.out.println("press 8 for choosing gun");
        System.out.println("press 9 for using gun1");
        System.out.println("press 10 for using gun2");
        System.out.println("press 11 for using strengthbooster");
        System.out.println("press 12 for on off armour");

        System.out.println("press 6 for exit game");
        team1 player1 = new team1();
        team2 player2 = new team2();
        do {
            option1 = sc.nextInt();
            switch (option1) {
                case 1:

                    System.out.print("enter player name");
                    String name1 = sc.next();
                    player1.setname(name1);
                    break;
                case 2:
                    System.out.print("enter gun name");
                    String name2 = sc.next();
                    player1.setname(name2);
                    break;
                case 3:
                    player1.damageByGun1();
                    break;
                case 4:
                    player1.damageByGun2();
                    break;
                case 5:
                    player1.energybooster();
                    break;
                case 6:
                    exit();

            }

        } while (option1 != 6);

        do {
            option2 = sc.nextInt();
            switch (option2) {
                case 7:

                    System.out.print("enter player name");
                    String name1 = sc.next();
                    player2.setname(name1);
                    break;
                case 8:
                    System.out.print("enter gun name");
                    String name2 = sc.next();
                    player2.setname(name2);
                    break;
                case 9:
                    player2.damageByGun1();
                    break;
                case 10:
                    player2.damageByGun2();
                    break;
                case 11:
                    player2.energybooster();
                    break;
                case 12:
                    System.out.println("enter true for on and false for off");
                    boolean value1 = sc.nextBoolean();
                    player2.setarmour(value1);
                    break;
                case 6:
                    exit();
            }

        } while (option1 != 6);
    }

    public static void exit() {
        System.out.println("Exit from game");
        return;
    }
}