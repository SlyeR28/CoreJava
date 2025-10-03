public class Dog extends Animal {
       private String eyesColour;

    public Dog(int age, String name, String species , String eyesColour )  {
        super(age, name, species);
        this.eyesColour = eyesColour;
    }

    public Dog(String eyesColour) {
        this.eyesColour = eyesColour;
    }

    public Dog() {
    }

    public String getEyesColour() {
        return eyesColour;
    }

    public void setEyesColour(String eyesColour) {
        this.eyesColour = eyesColour;
    }

    @Override
    int animalCount() {
            return 3;
    }
}
