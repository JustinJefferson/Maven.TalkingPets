package io.zipcoder.polymorphism;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AskForPets {

    private List<Pet> pets;
    private Integer numOfPets;
    private Scanner in;

    public AskForPets() {
        pets = new LinkedList<>();
        numOfPets = 0;
        in = new Scanner(System.in);
    }

    public void ask() {

        howMany();
        typeOfPet();
        printPets();

    }

    public void howMany() {
        while(numOfPets <= 0) {
            System.out.println("How many pets do you have?");
            numOfPets = in.nextInt();
            if(numOfPets <= 0) {
                System.out.println("Err: Invalid number. \nPlease use a valid number.");
            }
            else {
                System.out.println();
            }
        }
    }

    public void typeOfPet() {
        while(pets.size() < numOfPets) {
            System.out.println("Do you have a Dog, Cat or Parrot?");
            String type = in.next();
            in.nextLine();
            type = type.toUpperCase();

            System.out.println("What's their name?");
            String name = in.nextLine();

            switch(type) {
                case "CAT":
                    pets.add(PetFactory.createCat(name));
                    break;
                case "DOG":
                    pets.add(PetFactory.createDog(name));
                    break;
                case "PARROT":
                    pets.add(PetFactory.createParrot(name));
                    break;
                default:
                    System.out.println("Err: Invalid Type\n Try a different pet.");
            }
            System.out.println();
            if(pets.size() < numOfPets) System.out.println("You have another pet!");
        }

    }

    protected void printPets() {

        System.out.println("Here's a list of your Pets:\n");

        for(int i = 0; i < pets.size(); i++) {
            System.out.printf("Pet #%d: %s the %s\n",
                    i + 1,
                    pets.get(i).getName(),
                    pets.get(i).getSpecies()
            );
            System.out.printf("%s says %s!\n", pets.get(i).getName(), pets.get(i).speak());
        }
    }
}
