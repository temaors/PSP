import java.lang.reflect.Type;

public class Fighter implements Character, Object {
    protected String Name = null;
    protected double Health = 0;
    protected double Power = 0;
    protected double Dexterity = 0;
    private String TypeOfGun;
    private String FormOfShield;

    public String GetTypeOfGun(){
        return TypeOfGun;
    }

    public String GetFormOfShield(){
        return FormOfShield;
    }

    public Fighter(String typeOfGun, String formOfShield){
        TypeOfGun = typeOfGun;
        FormOfShield = formOfShield;
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
        System.out.println("Fighter is attacking");
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("This is Fighter with " + TypeOfGun + " and " + FormOfShield + " form of shield");
    }
}
