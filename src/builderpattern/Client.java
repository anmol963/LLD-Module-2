package builderpattern;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student();

        StudentBuilder sb = new StudentBuilder();
        sb.setAge(20);
        sb.setGradYear(2025);
        sb.setBatch("Jan 2025");

        Student st = new Student(sb);
    }
}

// don't want too many constructors
// we want the validations in place. Validation on one field could depend on another field,
// exposing setters is not a good idea. because it can lead to an invalid state.