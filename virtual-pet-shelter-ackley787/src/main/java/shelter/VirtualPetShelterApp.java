package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter = new VirtualPetShelter();

        VirtualPet pet1 = new VirtualPet(1, "Tankie", 50,50,50,50);
        VirtualPet pet2 = new VirtualPet(2, "Coco", 50,50,50,50);
        VirtualPet pet3 = new VirtualPet(3, "Casper", 50,50,50,50);

        myShelter.addPet(pet1);
        myShelter.addPet(pet2);


        int userChoice;

        do{
            System.out.println("Welcome to your Pet Shelter!");
            myShelter.getShelter();
            System.out.println("");

            System.out.println("Press 1 to feed pets");
            System.out.println("Press 2 to give pets water");
            System.out.println("Press 3 to to play with pets");
            System.out.println("Press 4 to add a pet");
            System.out.println("Press 5 to let your sister adopt a pet");
            System.out.println("Press 6 to let the pets outside to go potty");
            System.out.println("Press 9 to exit");
            System.out.println("");


            userChoice = input.nextInt();

            if (userChoice == 1){
                myShelter.feed();
                System.out.println("You fed all your pets");
            }
            else if(userChoice == 2){
                myShelter.watered();
                System.out.println("You gave water to all your pets");

            }
            else if(userChoice == 3) {
                myShelter.played();
                System.out.println("You played with all your pets");
            }
            else if(userChoice == 4) {
                myShelter.addPet(pet3);
                System.out.println("You found a Black Yorkie");
            }
            else if(userChoice == 5) {
                System.out.println("Which pet would you like to remove");
                System.out.println("Your current pets are ");
                myShelter.getShelter();

                myShelter.removePet(1);
                System.out.println("You let your sister adopt one of your pets");
            }
            else if(userChoice == 6) {
                myShelter.potty();
                System.out.println("You let the pets outside to go potty");
            }
            myShelter.Tick();

        }while (userChoice != 9);

    }
}
