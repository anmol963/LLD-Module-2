package builderpattern.withinner;

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

    public static class StudentBuilder {

        int age;
        String name;
        String batch;
        int gradYear;
        String course;

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Student build() {
            if(this.age < 10) {
                throw new IllegalArgumentException("Age must be atleast 10");
            }
            if(this.gradYear > 2024) {
                throw new IllegalArgumentException("Grad year must be smaller than or equal to 2024");
            }
            return new Student(this);
        }
    }
}
