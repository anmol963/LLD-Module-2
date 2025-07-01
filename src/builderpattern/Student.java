package builderpattern;

public class Student {

    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    Student(StudentBuilder builder) {
        if(builder.age < 10) {
            throw new IllegalArgumentException("Age must be atleast 10");
        }
        if(builder.gradYear > 2024) {
            throw new IllegalArgumentException("Grad year must be smaller than or equal to 2024");
        }
        this.age = builder.age;
        this.name = builder.name;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
        this.course = builder.course;
    }
}
