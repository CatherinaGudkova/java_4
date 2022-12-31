
import java.util.Random;
public class Division {
    private int id;
    private String name;

    public Division(String name) {
        this.name = name;
        Random rand= new Random();
        this.id=rand.nextInt(100000);
    }

    public String getName() {
        return name;
    }

    public int getID() {return id;}
    public String toStringDivision() {
        return
                "ID = " + id + ", НАИМЕНОВАНИЕ " + name  ;}
}

