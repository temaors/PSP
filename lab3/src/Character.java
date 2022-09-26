public interface Character {
    String name = "";
    double health = 0.0;
    double power = 0.0;
    double dexterity = 0.0;

    String GetName();

    public double GetHealth();

    public double GetPower();

    public double GetDexterity();
    public void Attack();
}
