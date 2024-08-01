package org.example.Adapter;

public class SchoolStudentAdapter implements Student{


    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }
    @Override
    public String getFirstName() {
        return this.schoolStudent.getFirtName();
    }

    @Override
    public String getLastName() {
        return this.schoolStudent.getSurname();
    }

    @Override
    public int getAge() {
        return Integer.parseInt(this.schoolStudent.getAge());
    }
}
