package shelter;

public class VirtualPet {

    private int NumOfPets;
    private String petName;
    private int Hunger;
    private int Thirst;
    private int Bored;
    private int Outside;

    public VirtualPet(int NumOfPets, String petName, int Hunger, int Thirst, int Bored, int Outside) {
        this.NumOfPets = NumOfPets;
        this.petName = petName;
        this.Hunger = Hunger;
        this.Thirst = Thirst;
        this.Bored = Bored;
        this.Outside = Outside;
    }
    public int findPet() {
        return NumOfPets;
    }
    public String getPetName() {
        return petName;
    }
    public int getHunger() {
        return Hunger;
    }
    public int getThirst() {
        return Thirst;
    }
    public int getBored() {
        return Bored;
    }
    public int getOutside() {
        return Outside;
    }
    public void feed() {
        this.Hunger += 20;
   }
    public void watered() {
        this.Thirst += 20;
    }
    public void played() {
        this.Bored += 20;
    }
    public void potty() {
        this.Outside += 20;
    }

    public void tick(){
        this.Hunger -=10;
        this.Thirst -=10;
        this.Bored -=10;
        this.Outside -=10;
    }

}

