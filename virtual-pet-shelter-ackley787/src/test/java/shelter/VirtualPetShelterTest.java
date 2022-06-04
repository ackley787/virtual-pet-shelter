package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;
    int petToRemove = 1;
    int NumOfPets = 1;

    @BeforeEach
    public void setUp() {

        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet(1, "tank", 50,50, 50, 50);
        pet2 = new VirtualPet(2, "coco", 50, 50, 50, 50);
    }

    @Test
    public void shouldBeAbleToAddAPet() {
        underTest.addPet(pet1);
        int getPet = underTest.findPet(1);
        assertEquals(1, underTest.findPet(NumOfPets));
    }
    @Test
    public void shouldBeAbleToAdd2Pets() {
        underTest.addPet(pet1);
        underTest.addPet(pet2);
        assertEquals(2, underTest.findPet(NumOfPets));
    }
    @Test
    public void shouldBeAbleToRemoveAPet() {
        underTest.addPet(pet1);
        underTest.addPet(pet2);
        underTest.removePet(petToRemove);
        Collection<VirtualPet> pets = underTest.Shelter();
//          VirtualPetShelter.getPetToRemove = underTest.findPet(petToRemove);
        assertEquals(1, pets.size());
    }
//    @Test
//    public void shouldFeedAllPets() {
//        underTest.add(pet1);
//        underTest.add(pet2);
//        underTest.feed(pet1);
//        underTest.feed(pet1.findPet(), 20);
//
//    }


}


