package com.company;

/**
 * Created by dpennebacker on 10/25/16.
 */
public class student {
    public String name, gender;
    public int grade;
    public double GPA;

    public student(String n, int g, double gpa, String gen)
    {
        name = n;
        grade = g;
        GPA = gpa;
        gender = gen;
    }
}
