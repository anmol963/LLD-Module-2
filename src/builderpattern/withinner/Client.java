package builderpattern.withinner;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student();

//        StudentBuilder sb = new StudentBuilder();
//        sb.setAge(20);
//        sb.setGradYear(2025);
//        sb.setBatch("Jan 2025");
//
//        Student st = new Student(sb);

//        StudentBuilder sb = Student.getBuilder()
//                .setAge(24)
//                .setGradYear(2024)
//                .setBatch("Jan 2024");
//
//        Student st = new Student(sb);

        /* when I have normal constructors, I can create an object like this
        But we have validations in place inside build method and we are bypassing that
        Student.StudentBuilder sb = Student.getBuilder()
                .setAge(24)
                .setGradYear(2025)
                .setBatch("Jan 2025")
                .setCourse("Java");
        Student st = new Student(sb);
         */

         Student st = Student.getBuilder()
                .setAge(24)
                .setBatch("Jan 2025")
                .setGradYear(2025)
                .build();
    }
}

// don't want too many constructors
// we want the validations in place. Validation on one field could depend on another field,
// exposing setters is not a good idea. because it can lead to an invalid state.