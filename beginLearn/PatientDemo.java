class Patient {
    String name;
    int age;
    float height;

    public Patient(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

public class PatientDemo {
    public static void main(String[] args) {
        Patient john = new Patient("Heinrich",40,182.02f);
        System.out.println(john.name + " " + john.age + " " + john.height);

        Patient alice = new Patient("Mary",33,171.5f);
        System.out.println(alice.name + " " + alice.age + " " + alice.height);
    }
}