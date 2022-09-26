public class Main {
    public static void main(String[] args)
    {
        Manager man1 = new Manager();

        Manager man2 = new Manager("Orsik", 19);
        Manager man3 = new Manager("Gudoit", 19, false);

        man3.DisplayInfo();
        man2.ShowInfo();

        WriterInfo info = new WriterInfo();

        info.WriteInfo(man1);
    }
}