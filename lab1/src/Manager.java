public class Manager {
    private String LastName;
    private int Age;
    private boolean IsCopeWithDuties;

    public Manager()
    {
        LastName = "Ivanov";
        Age = 30;
        IsCopeWithDuties = true;
    }

    public Manager(String lastName, int age, boolean isCopeWithDuties)
    {
        LastName = lastName;
        Age = age;
        IsCopeWithDuties = isCopeWithDuties;
    }

    public Manager(String LasName, int age){
        LastName = LasName;
        Age = age;
        IsCopeWithDuties = false;
    }

    public Manager(Manager man){
        LastName = man.getLastName();
        Age = man.getAge();
        IsCopeWithDuties = man.getIsCopeWithDuties();
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public boolean getIsCopeWithDuties() {
        return IsCopeWithDuties;
    }

    public void DisplayInfo()
    {
        System.out.println("Last name: " + LastName);
        System.out.println("Age: " + Age);
        if (IsCopeWithDuties){
            System.out.println("Does he/she cope with his/her duties: Yes");
        }
        else{
            System.out.println("Does he/she cope with his/her duties: No");
        }
    }

    public void ShowInfo(){
        if (IsCopeWithDuties){
            System.out.println("Employee " + getLastName() + ", who is " + getAge() + " years old, copes with his duties");
        }
        else{
            System.out.println("Employee " + getLastName() + ", who is " + getAge() + " years old, does not cope with his duties");
        }
    }
}
