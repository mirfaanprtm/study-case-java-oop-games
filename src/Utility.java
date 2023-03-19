import java.util.Scanner;

public class Utility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player(100);
        Player player2 = new Player(100);

        // Pick Hero
        System.out.print("Masukkan Player 1 : ");
        player.setName(scanner.nextLine());
        System.out.print("Masukkan Player 2 : ");
        player2.setName(scanner.nextLine());


        System.out.println("Player 1 --> " + player.getName() + " HP : " + player.getHealth());
        System.out.println("Player 2 --> " + player2.getName() + " HP : " + player.getHealth());
        System.out.println();

        // Pilih senjata
        System.out.println("===Pilih Weapon===");
        System.out.println("1. DHS --> Power 80");
        System.out.println("2. BOD --> Power 90");
        System.out.println("3. Wind Talker --> Power 85");
        System.out.println("4. War Exe --> Power 88");
        System.out.println("5. WON --> Power 92");
        System.out.print("Pilih Weapon Player 1 : ");
        Weapon weapon1 = pickWeapon(scanner.nextInt());
        player.setWeapon(weapon1);
        System.out.print("Pilih Weapon Player 2 : ");
        Weapon weapon2 = pickWeapon(scanner.nextInt());
        player2.setWeapon(weapon2);

        System.out.println("Weapon Player 1 --> " + weapon1.getName());
        System.out.println("Weapon Player 2 --> " + weapon2.getName());
        System.out.println();

        // Pilih Armor
        System.out.println("===Pilih Armor===");
        System.out.println("1. Immortal --> Power 60");
        System.out.println("2. Winter --> Power 70");
        System.out.println("3. Wind Talker --> Power 65");
        System.out.println("4. Radiant --> Power 67");
        System.out.println("5. Guardian Helmet --> Power 75");
        System.out.print("Pilih Weapon Player 1 : ");
        Armor armor1 = pickArmor(scanner.nextInt());
        player.setArmor(armor1);
        System.out.print("Pilih Weapon Player 2 : ");
        Armor armor2 = pickArmor(scanner.nextInt());
        player2.setArmor(armor2);

        System.out.println("Armor Player 1 --> " + armor1.getName());
        System.out.println("Armor Player 2 --> " + armor2.getName());

        String name = player.getName();
        String name2 = player2.getName();
        double attackPower = player.getWeapon().getAttackPower();
        double attackPower2 = player2.getWeapon().getAttackPower();

        // Bertarung
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        for(int i = 1; i < 6; i++){
            player.setHealth(100);
            player2.setHealth(100);

            System.out.println();
            System.out.println("===Round " + i + "===");

            while(player.getHealth() > 1 && player2.getHealth() > 1){
                long randomMatch = Math.round(Math.random());

                if(randomMatch % 2 == 0){
                    player.attack(player2);
                    player2.deff(attackPower);

                    if(player2.getHealth() < 1){
                        player2.setHealth(0);
                    }
                    System.out.println("Stat HP " + name + ": " + player.getHealth());
                    System.out.println("Stat HP " + name2 + ": " + player2.getHealth());
                    System.out.println();
                } else {
                    player2.attack(player);
                    player.deff(attackPower2);

                    if (player.getHealth() < 1) player.setHealth(0);

                    System.out.println("Stat HP " + name + ": " + player.getHealth());
                    System.out.println("Stat HP " + name2 + ": " + player2.getHealth());
                    System.out.println();
                }
            }

            Player winner;
            if (player.getHealth() > 1) winner = player;
            else winner = player2;

            System.out.println("Round " + i + " Winner is " + winner.getName());

            if (winner == player) scorePlayer1++;
            else scorePlayer2++;
        }

            System.out.println("\n=== SCORE AKHIR ===");

            System.out.println("Score Player 1 " + name + ": " + scorePlayer1);
            System.out.println("score Player 2 " + name2 + ": " + scorePlayer2);

            String championName = scorePlayer1 > scorePlayer2 ? name : name2;

            System.out.println("Winner : " + championName);
    }


    public static Weapon pickWeapon (int pick){
        Weapon picked = new Weapon();

        switch (pick){
            case 1:
                picked.setName("DHS");
                picked.setAttackPower(80);
                break;
            case 2:
                picked.setName("BOD");
                picked.setAttackPower(90);
                break;
            case 3:
                picked.setName("Wind Talker");
                picked.setAttackPower(85);
                break;
            case 4:
                picked.setName("War Exe");
                picked.setAttackPower(88);
                break;
            case 5:
                picked.setName("WON");
                picked.setAttackPower(92);
                break;
            default:
                pickWeapon(pick);
        }
        return picked;
    }

    public static Armor pickArmor (int pick){
        Armor picked = new Armor();

        switch (pick){
            case 1:
                picked.setName("Immortal");
                picked.setDefPower(60);
                break;
            case 2:
                picked.setName("Winter");
                picked.setDefPower(70);
                break;
            case 3:
                picked.setName("Wind Talker");
                picked.setDefPower(65);
                break;
            case 4:
                picked.setName("Radiant");
                picked.setDefPower(67);
                break;
            case 5:
                picked.setName("Guardian Helmet");
                picked.setDefPower(75);
                break;
            default:
                pickArmor(pick);
        }
        return picked;
    }
}
