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
        System.out.println();
    }


    @Override
    public void Attack() {
        System.out.println("Slow monster is attacking");
    }
}
