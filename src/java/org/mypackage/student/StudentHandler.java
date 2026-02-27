/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mypackage.student;

import java.time.LocalDate;
import java.time.Period;

public class StudentHandler {

    private String name;
    private String birthDate;  // ← ahora es String

    public StudentHandler() {
        name = null;
        birthDate = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        if (birthDate == null || birthDate.isEmpty()) return 0;

        LocalDate date = LocalDate.parse(birthDate);
        return Period.between(date, LocalDate.now()).getYears();
    }
}