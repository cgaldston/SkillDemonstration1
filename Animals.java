public class Animals {
    int legs;
    int head;
    String name;

    public Animals(int legs, int head, String name) {
        this.legs = legs;
        this.head = head;
        this.name = name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return this.legs;
    }
}
