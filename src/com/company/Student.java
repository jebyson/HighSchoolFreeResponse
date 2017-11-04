package com.company;

/**
 * Created by je565 on 11/3/17.
 */
public class Student {
    String names [] = new String[10];
    public double GPA;
    public boolean honorsYesNo;

    public Student(String [] x)
    {
        names.equals(x);
    }

    public double getGPA(double x)
    {
        GPA = x;
        return GPA;
    }

    public boolean isHonors(boolean b)
    {
        honorsYesNo = b;
        return honorsYesNo;
    }
}

/*
The main issue for me is figuring out how to implement the Student class in the HighSchoolClass class,
which then goes into the Main.java file. I am not sure how to use the String arrays properly in order
to get the HighSchoolClass to work.
 */