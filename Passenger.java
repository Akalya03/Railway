public class Passenger{
    static int id;
    String name;
    int age;
    String berthPreference;
    int passengerId;
    String alloted;
    int number;
    
    public Passenger(String name, int age, String berthpreference){
        this.name=name;
        this.age=age;
        this.berthPreference=berthpreference;
        this.passengerId=++id;
        alloted="";
        number=-1;

    }
}