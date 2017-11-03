package com.company;

import java.util.Arrays;

/**
 * Created by je565 on 11/2/17.
 */
public class HighSchoolClass {

    private Student [] students = new Student[10];
    public double GPA;
    public boolean honorsYesNo;

    public HighSchoolClass(String [] names){
        students.equals(names);
    }

    public Student getValedictorian()
    {
        Student val;

        for(int i = 0; i < students.length; i++)
        {
            int a = students[i].getGPA;
            int b = students[i + 1].getGPA;

            if(a > b)
            {
                val = students[i];
            }
            else
            {
                val = students[i + 1];
            }
        }

        return val;
    }

    public double getHonorsPercent()
    {
        int cnt = 0;

        for(int k = 0; k < students.length; k++)
        {
            if(students[k].isHonors)
            {
                cnt++;
            }
        }

        double perc = (cnt/students.length) * 100;
        return perc;
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
