package thelostkingdom;

import java.util.Scanner;

public class TheLostKingdom {

    Scanner sc = new Scanner(System.in);
    int begin = 2;

    public static void main(String[] args) {
        new TheLostKingdom().run();
    }

    public void run() {
        System.out.print("Please enter your name:");

        String name = sc.next().trim();
        System.out.println("Welcome to the story of the Lost Kingdom, " + name + "!!");

        story();
    }

    public void story() {

        System.out.println("\nINTRODUCTION: \n You find yourself standing at the edge of a dense forest,\n"
                         + "the last rays of sunlight fading away. A mysterious scroll lies at your feet,\n"
                         + "pulsating with magical energy. As you pick it up, the words on the scroll begin\n"
                         + "to glow, revealing a message: \"Seek the lost kingdom and claim your destiny.\"\n"
                         + "Intrigued, you decide to embark on a quest to uncover the secrets of the lost kingdom");

        System.out.println("\n\n\t\tSCENE 1. THE FORREST.\n\n"
                + "You venture into the forest, the trees looming overhead like ancient guardians.\n"
                + "Soon, you come across a fork in the path.");

        System.out.println("Please Select a path (1 or 2): \n 1. Left path.\n 2. Right path");

        int paths = sc.nextInt();
        
        while (true) {

            if (!(paths == 1) && !(paths == 2)) {
                System.out.println("Please Enter 1 or 2");
                paths = sc.nextInt();
               
            } else {
                break;
            }
            

        }

        switch (paths) {
            case 1: 
                System.out.println("You follow the left path, which leads you deeper into the heart of the forest.\n"
                                 + "As you walk, you hear the distant sounds of creatures stirring in the undergrowth.\n"
                                 + "Suddenly, you stumble upon a hidden glade where a group of friendly woodland creatures awaits you.\n"
                                 + "They offer to guide you further into the forest, leading you to a hidden clearing where a magical portal awaits.");
                break;
            case 2:
                System.out.println("You choose the right path, which winds through thickets and thorns.\n"
                                 + "Soon, you find yourself lost in the maze of trees. As night falls,\n"
                                 + "you stumble upon a clearing where a group of sinister-looking creatures\n"
                                 + "lurks in the shadows. They demand a toll for safe passage.");
                 System.out.println("You can either (1 or 2):\n 1. Pay the toll.\n 2. Refuse to pay and fight your way through.");
                                 
                int c1 = sc.nextInt();
                while (true) {

                    if (!(c1 == 1) && !(c1 == 2)) {
                        System.out.println("Please Enter 1 or 2");
                        c1 = sc.nextInt();
                        
                    } else {
                        break;
                    }

                }
                switch (c1) {
                    case 1:
                        System.out.println("You reluctantly hand over the requested payment, and the creatures allow you to pass.\n"
                                         + "However, you can't shake the feeling that you've been duped. You continue on your journey,\n"
                                         + "wary of further dangers.");
                        break;
                    case 2:
                        System.out.println("You stand your ground, refusing to give in to the creatures' demands. A fierce battle ensues,\n"
                                         + "but you emerge victorious. Bruised and weary, you press on, determined to uncover the secrets\n"
                                         + "of the lost kingdom.");
                        break;
                    
                }
                break;
        }
        
        System.out.println("\n\n\t\tSCENE 2: THE ENCHATED LAKE\n");
        
        System.out.println("As you journey deeper into the forest, you stumble upon a tranquil lake shimmering in the moonlight.\n"
                         + "A sense of peace washes over you, but your reverie is interrupted by a mysterious figure emerging from\n"
                         + "the depths of the water.");
        
        System.out.println("Please select an action (1 or 2):\n 1. Approach the figure.\n 2. Ignore the figure and continue on your way.");
        
        int dec = sc.nextInt();
        
         while (true) {

            if (!(dec == 1) && !(dec == 2)) {
                System.out.println("Please Enter 1 or 2");
                dec = sc.nextInt();
               
            } else {
                break;
            }
            

        }

        switch (dec) {
            case 1: 
                System.out.println("You cautiously approach the figure, who introduces herself as the guardian of the enchanted lake.\n"
                                 + "She offers to share her wisdom with you, revealing clues about the location of the lost kingdom and\n"
                                 + "the challenges you will face along the way. Grateful for her guidance, you thank her and continue your\n"
                                 + "journey with newfound determination.");
                break;
            case 2:
                System.out.println("You decide to ignore the mysterious figure and press on, eager to reach your destination.\n"
                                 + "However, as you turn away, you feel a sense of foreboding creep over you. You can't shake the\n"
                                 + "feeling that you've missed out on an important opportunity, but you push the thought aside and\n"
                                 + "continue on your way.");                
                break;
        }
        
        
        System.out.println("\n\n\t\tSCENE 3: THE HIDDEN TEMPLE\n\n");
        
        
         System.out.println("After hours of travel, you finally arrive at the entrance to a hidden temple concealed deep within the forest.\n"
                          + " Ancient runes adorn the walls, their meaning obscured by time.");
        
        System.out.println("Please select an action (1 or 2):\n 1. Enter the temple.\n 2. Search for another way around.");
        
        int act = sc.nextInt();
        
         while (true) {

            if (!(act == 1) && !(act == 2)) {
                System.out.println("Please Enter 1 or 2");
                act = sc.nextInt();
               
            } else {
                break;
            }
            

        }

        switch (act) {
            case 1: 
                System.out.println("You gather your courage and step inside the temple, the air thick with the scent of incense.\n"
                                 + "As you explore the dimly lit corridors, you encounter traps and puzzles designed to test your\n"
                                 + "wit and agility. With each challenge you overcome, you feel closer to unraveling the secrets of\n"
                                 + "the lost kingdom.");
                break;
            case 2:
                System.out.println("You decide to search for an alternate route, hoping to bypass the dangers lurking within the temple.\n"
                                 + "After hours of exploration, you discover a hidden passage that leads you safely past the temple's\n"
                                 + "defenses. While you may have avoided immediate danger, you can't help but wonder what secrets you missed\n"
                                 + "within the temple's walls.");                
                break;
        }   
        
        System.out.println("\n\nCONCLUSION\n\n");
        System.out.println("As you journey deeper into the forest, you can't help but marvel at the wonders and dangers that lie hidden within\n"
                         + "its depths. With each step, you draw closer to uncovering the mysteries of the lost kingdom and claiming your destiny.\n"
                         + "The path ahead is fraught with peril, but you face the challenges with courage and determination, knowing that your fate\n"
                         + "awaits you at journey's end");

    }

}






