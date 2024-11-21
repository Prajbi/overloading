public class Constructor_overloading {
    int id;
    String name;

    Constructor_overloading() {
        System.out.println("this a default constructor");

    }

    Constructor_overloading(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        Constructor_overloading s1 = new Constructor_overloading();
        System.out.println("\nDefault Constructor values:\n");
        System.out.println("student id :" + "s1.id" + "\nstudent Name:" + s1.name);

        System.out.println("\nParameterized Constructor values\n");
        Constructor_overloading s2 = new Constructor_overloading(10, "david");
        System.out.println("string Id :" + "s1.id" + "\nstudent Name:" + s2.name);
    }
}