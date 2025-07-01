package builderpattern;

public class Student {

    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    Student(StudentBuilder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
        this.course = builder.course;
    }

    static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }
}
