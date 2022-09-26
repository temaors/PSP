public abstract class Monster implements Character, Object {

    protected String Name = null;
    protected double Health = 0;
    protected double Power = 0;
    protected double Dexterity = 0;
    protected double ToothLength;
    protected double ClawsLength;
    protected int PawsNumber;

    public Monster(String name, double health, double power, double dexterity, double toothLength, double clawsLength, int pawsNumber){
        ToothLength = toothLength;
        ClawsLength = clawsLength;
        PawsNumber = pawsNumber;
        Name = name;
        Health = health;
        Power = power;
        Dexterity = dexterity;
    }

    public double GetToothLength() {
        return ToothLength;
    }

    public double GetClawsLength() {
        return ClawsLength;
    }

    public int GetPawsNumber() {
        return PawsNumber;
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
    public abstract void print();
}
