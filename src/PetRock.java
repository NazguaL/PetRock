public class PetRock {
    public String name;
    private boolean happy = false;

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWihtRock() {
        setHappy(true);
    }
}
