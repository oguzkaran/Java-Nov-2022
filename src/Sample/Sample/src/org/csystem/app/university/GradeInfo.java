package org.csystem.app.university;

public class GradeInfo {
    public String studentName;
    public String lectureName;
    public String midtermDate;
    public String finalDate;

    public int midtermGrade;
    public int finalGrade;

    //...

    public int getTotalGrade()
    {
        return (int)Math.ceil(midtermGrade * 0.4 + finalGrade * 0.6);
    }

    //...
}
