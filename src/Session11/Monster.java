package Session11;

abstract public class Monster {
    private String name;

    public Monster(String name) {
        this.name = name;
    }
    abstract public String attack();
}
