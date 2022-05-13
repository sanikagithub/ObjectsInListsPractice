public class Animal {
    private String name;
    private boolean YesorNo;

    // the class constructor
    public Animal(String animalName, boolean YesorNo) {
        this.name = animalName;
        this.YesorNo = YesorNo;
    }
    public String getName() {
        return name;
    }

    public boolean getYesorNo() {
        return YesorNo;
    }

    public String toString(){
        return getName() + " is a dog = " + getYesorNo();
    }
}