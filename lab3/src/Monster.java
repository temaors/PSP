public abstract class Monster implements Character, Object {
    private double ToothLength;
    private double ClawsLength;
    private int PawsNumber;

    public double GetToothLength(){
        return ToothLength;
    }

    public double GetClawsLength(){
        return ClawsLength;
    }

    public int GetPawsNumber(){
        return PawsNumber;
    }
}
