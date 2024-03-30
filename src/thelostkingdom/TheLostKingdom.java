package thelostkingdom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TheLostKingdom {

    Scanner sc = new Scanner(System.in);
    int begin = 2;
    Player player;

    public static void main(String[] args) {
        new TheLostKingdom().run();
    }

    public void run() {
        System.out.print("Please enter your name:");

        String name = sc.next().trim();
        System.out.println("Welcome to the story of the Lost Kingdom " + name + "!!");

//        System.out.println("Please select a Class: \n"
//                + "1. Knight - 50 Health Points.12 Armor Points.\n"
//                + "            Weapon: Sword, 16 damage per hit ");
        player = new Player(name);

        story();
    }

    public void story() {

        System.out.println("\nINTRODUCTION: \n You find yourself standing at the edge of a dense forest,\n"
                + " the last rays of sunlight fading away. A mysterious scroll lies at your feet,\n"
                + " pulsating with magical energy. As you pick it up, the words on the scroll begin\n"
                + " to glow, revealing a message: \"Seek the lost kingdom and claim your destiny.\"\n"
                + " Intrigued, you decide to embark on a quest to uncover the secrets of the lost kingdom");

        System.out.println("SCENE 1. THE FORREST./n"
                + "You venture into the forest, the trees looming overhead like ancient guardians./n"
                + " Soon, you come across a fork in the path.");

        System.out.println("Please Select a path (1/2): \n 1. Left path.\n 2. Right path");

        int paths = sc.nextInt();
        while (true) {

            if (paths != 1 || paths != 2) {
                System.out.println("Please Enter 1 or 2");
                paths = sc.nextInt();
            } else {
                break;
            }

        }

        switch (paths) {
            case 1:
                System.out.println("You follow the left path, which leads you deeper into the heart of the forest.\n"
                        + " As you walk, you hear the distant sounds of creatures stirring in the undergrowth.\n"
                        + " Suddenly, you stumble upon a hidden glade where a group of friendly woodland creatures awaits you.\n"
                        + " They offer to guide you further into the forest, leading you to a hidden clearing where a magical portal awaits.");
                break;
            case 2:
                System.out.println("You choose the right path, which winds through thickets and thorns.\n"
                        + " Soon, you find yourself lost in the maze of trees. As night falls,\n"
                        + " you stumble upon a clearing where a group of sinister-looking creatures\n"
                        + " lurks in the shadows. They demand a toll for safe passage.\n"
                        + " You can either:\n"
                        + "\t\t 1. Pay the toll\n"
                        + "\t\t 2. Refuse to pay and fight your way through");
                int c1 = sc.nextInt();
                while (true) {

                    if (c1 != 1 || c1 != 2) {
                        System.out.println("Please Enter 1 or 2");
                        c1 = sc.nextInt();
                    } else {
                        break;
                    }

                }
                switch (c1) {
                    case 1:
                        System.out.println("You reluctantly hand over the requested payment, and the creatures allow you to pass.\n"
                                + " However, you can't shake the feeling that you've been duped. You continue on your journey,\n"
                                + " wary of further dangers.");
                    case 2:
                        System.out.println("You stand your ground, refusing to give in to the creatures' demands. A fierce battle ensues,\n"
                                + " but you emerge victorious. Bruised and weary, you press on, determined to uncover the secrets of the lost kingdom.");

                    
                }
        }

    }

}
