abstract class Animal {
    private String name;

    private String species;
    private int age;

    abstract int animalCount();

    protected Animal() {
    }

    protected Animal(int age, String name, String species) {
        this.age = age;
        this.name = name;
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void sleep(){
        System.out.println("animals are sleeping....");
    }

}
