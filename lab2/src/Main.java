import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Manager[] managers = new Manager[3];

        Manager man1 = new Manager();

        Manager man2 = new Manager("Orsik", 19);
        Manager man3 = new Manager("Gudoit", 19, false);

        managers[0] = man1;
        managers[1] = man2;
        managers[2] = man3;

        for(int i = 0; i < 3; i++){
            managers[i].DisplayInfo();
        }

        System.out.println("Average age of managers: " + getAvgAge(managers));

        System.out.println("Count of managers who cope with their duties: " + getCount(managers));
    }

    public static double getAvgAge(Manager[] managers){
        double age = 0.0;

        for (int i = 0; i < 3; i++){
            age += managers[i].getAge();
        }

        age /= 3;

        return age;
    }

    public static int getCount(Manager[] managers){
        int count = 0;
        for (int i = 0; i < 3; i++){
            if (managers[i].getIsCopeWithDuties()){
                count++;
            }
        }
        return count;
    }
}