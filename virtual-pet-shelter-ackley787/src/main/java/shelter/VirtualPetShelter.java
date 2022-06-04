package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

    static int NumOfPets = 0;
    private int petToRemove = 1;

    static Map<Integer, VirtualPet> pets = new HashMap<>();

    public void getShelter() {
        for (Entry<Integer, VirtualPet> entry : pets.entrySet()) {
            System.out.println("Pet name " + entry.getValue().getPetName() + " Pet Hunger "
                    + entry.getValue().getHunger() + " Pet Thirst " + entry.getValue().getThirst()
                    + " Pet Boredom " + entry.getValue().getBored()
                    + " Pet Outside " + entry.getValue().getOutside());
        }
    }
    public Collection<VirtualPet> Shelter() {

        return pets.values();
    }
    public void Tick() {
        for(Entry<Integer, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().tick();
        }
    }

    public void addPet(VirtualPet petToAdd) {
        NumOfPets++;
        pets.put(NumOfPets, petToAdd);
    }

    public void removePet(int petToRemove) {
        pets.remove(petToRemove);
        NumOfPets--;
    }

    public int findPet(int NumOfPets) {
        return (NumOfPets);
    }
    public void feed() {
        for (Entry<Integer, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().feed();
        }
    }
    public void watered() {
        for (Entry<Integer, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().watered();
        }
    }

    public void played() {
        for (Entry<Integer, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().played();
        }
    }
    public void potty() {
        for (Entry<Integer, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().potty();
        }
    }

}
