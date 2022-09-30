public class Main {
    public static void main(String[] args) {
        Magician magician = new Magician("Blood magic");
        Fighter fighter = new Fighter("M4A1-S", "triangle");
        FastMonster fastMonster = new FastMonster("andrey", 0.4,0.1,0.8,10,10,4,"Student");
        SlowMonster slowMonster = new SlowMonster("sloooooow", 0.4,0.1,0.8,10,10,4,"teacher");


        fastMonster.print();
        fastMonster.Attack();

        magician.print();
        magician.Attack();

        fighter.print();
        fighter.Attack();

        slowMonster.print();
        slowMonster.Attack();
    }
}