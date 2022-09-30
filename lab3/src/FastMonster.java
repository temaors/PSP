public class FastMonster extends Monster {
    String Type;

    String GetType(){
        return Type;
    }

    public FastMonster(String name, double health, double power, double dexterity, double toothLength, double ClawsLength, int pawsNumber, String type) {
        super(name, health, power, dexterity, toothLength, ClawsLength, pawsNumber);

        Type = type;
    }

    public void print(){
        System.out.println("Fast Monster:");
        System.out.println("Name: " + Name);
        System.out.println("Health: " + Health);
        System.out.println("Power: " + Power);
        System.out.println("Tooth length: " + ToothLength);
        System.out.println("Claws length: " + ClawsLength);
        System.out.println("Number of paws: " + PawsNumber);
        System.out.println("Type: " + Type);
        System.out.println("FAST MONSTERRRRRRR");
    }


    @Override
    public void Attack() {
        System.out.println("Fast monster is attacking");
        System.out.println();
    }
}
