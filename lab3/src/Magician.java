import javax.naming.Name;
import java.lang.reflect.Type;

public class Magician implements Character, Object{
    protected String Name = null;
    protected double Health = 0;
    protected double Power = 0;
    protected double Dexterity = 0;
    private String TypeOfMagic;

    public String GetTypeOfMagic(){
        return TypeOfMagic;
    }

    public Magician(String typeOfMagic){
        TypeOfMagic = typeOfMagic;
    }

    public String GetName() {
        return Name;
    }

    public double GetHealth() {
        return Health;
    }

    public double GetPower() {
        return Power;
    }

    public double GetDexterity() {
        return Dexterity;
    }

    @Override
    public void Attack() {
        System.out.println("Magician is attacking");
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("This is Magician with " + TypeOfMagic);
    }
}
