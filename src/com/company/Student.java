package com.company;

public class Student {

    String name;
    int age;

    // конструктор по умолчанию
    public Student() {
        name = "Ben";
        age = 19;
    }

    // конструктор с параметром name
    public Student(String name) {
        this.name = name;
    }

    // конструктор с параметрами name и age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

        public static void main(String[] args) {
           Student student1 = new Student();
           student1.displayInfo();

           Student student2 = new Student("Tom");
           student2.displayInfo();

           Student student3 = new Student("Jerry",18);
           student3.displayInfo();

        }

void displayInfo() {
    System.out.println("Student name: "+name+"; "+"Student age: "+age);
}

}

