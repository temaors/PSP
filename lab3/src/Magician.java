import java.lang.reflect.Type;

public class Magician implements Character, Object{
    private String TypeOfMagic;

    public String GetTypeOfMagic(){
        return TypeOfMagic;
    }

    public Magician(String typeOfMagic){
        TypeOfMagic = typeOfMagic;
    }

    @Override
    public String GetName() {
        return null;
    }

    @Override
    public double GetHealth() {
        return 0;
    }

    @Override
    public double GetPower() {
        return 0;
    }

    @Override
    public double GetDexterity() {
        return 0;
    }

    @Override
    public void Attack() {
        System.out.println("Magician is attacking");
    }

    @Override
    public void print() {
        System.out.println("This is Magician with " + TypeOfMagic);
    }
}
