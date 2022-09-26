import java.lang.reflect.Type;

public class Fighter implements Character, Object {
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
        System.out.println("Fighter is attacking");
    }

    @Override
    public void print() {
        System.out.println("This is Fighter with " + TypeOfGun + " and " + FormOfShield + " form of shield");
    }
}
