
public abstract class Pockemon implements Attackable  {
    private String name;
    private String type;
    private int health;

    public Pockemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public abstract String logAll();

   
}
