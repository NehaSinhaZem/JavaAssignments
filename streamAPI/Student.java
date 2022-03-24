package streamAPI;

class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int year_of_enrollment;
    double perTillDate;

    Student(int id, String name, int age, String gender, String engDepartment, int enrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.year_of_enrollment = enrollment;
        this.perTillDate = perTillDate;
    }

    String getGender() {
        return gender;
    }

    int getAge() {
        return age;
    }

    String getDepartment() {
        return engDepartment;
    }

    double getPercentage() {
        return perTillDate;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\tName: " + name + "\tAge: " + age + "\tGender: " + gender + "\tDepartment: " + engDepartment
                + "\tEnrollment year: " + year_of_enrollment + "\tCurrent Percentage: " + perTillDate;
    }
}
