package com.mycompany.bookshop;

public class Employee extends Person {
    private String position;
    private int salary;

    // Constructor
    public Employee(String name, int age, String position, int salary) {
        super(name, age);  // Person sınıfının constructor'ını çağır
        this.position = position;
        this.salary = salary;
    }

    // Getter ve Setter metodları
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Metod aşırı yükleme (Overloading)
    public String getDetails() {
        return getName() + ", Birthday: " + getAge() + ", Job: " + position;
    }

    public String getDetails(boolean includeSalary) {
        if (includeSalary) {
            return getName() + ", Age: " + getAge() + ", Position: " + position + ", Salary: " + salary;
        } else {
            return getDetails();
        }
    }
}