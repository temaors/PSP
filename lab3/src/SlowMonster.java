import javax.naming.Name;

public class SlowMonster extends Monster {
    private String Type;

    public SlowMonster(String name, double health, double power, double dexterity, double toothLength, double ClawsLength, int pawsNumber, String type) {
        super(name, health, power, dexterity, toothLength, ClawsLength, pawsNumber);

        Type = type;
    }

    public String GetType(){
        return Type;
    }


    public void print(){
        System.out.println("Slow Monster:");
        System.out.println("Name:");
        System.out.println("Health:");
        System.out.println("Power:");
        System.out.println("Tooth length:");
        System.out.println("Claws length:");
        System.out.println("Number of paws:");


    }

    @Override
    public void Attack() {
        System.out.println("Slow monster is attacking");
    }
}
