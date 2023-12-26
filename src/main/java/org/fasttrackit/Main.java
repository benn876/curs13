package org.fasttrackit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student studentMihai = new Student("Mihai", "Georgescu", 22, "Mihai Eminescu", List.of());
        Student studentAna = new Student("Ana", "Popa");
        System.out.println(studentMihai.getFirstName());
        System.out.println(studentMihai);

        Student studentGeorge = studentMihai.withFirstName("George")
                .withAge(21);

        Student studentIon = Student.builder()
                .firstName("Ion")
                .lastName("Ionut")
                .age(11)
                .hobbies(List.of())
                .schoolName("SchoolName")
                .build();
        System.out.println(studentIon);
    }
}