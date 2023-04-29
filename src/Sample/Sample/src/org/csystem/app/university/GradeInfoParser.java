package org.csystem.app.university;

import org.csystem.app.datetime.DateUtil;

public class GradeInfoParser {
    public GradeInfo gradeInfo;

    public static String getDateStr(String str)
    {
        String [] dateInfo = str.split("[/]");

        int day = Integer.parseInt(dateInfo[0]);
        int month = Integer.parseInt(dateInfo[1]);
        int year = Integer.parseInt(dateInfo[2]);

        return DateUtil.getDateStrTR(day, month, year);
    }

    public GradeInfoParser(String dataStr)
    {
        //...
        String [] gradeInfoStr = dataStr.split("[:]+");

        //...

        gradeInfo = new GradeInfo();

        gradeInfo.studentName = gradeInfoStr[0];
        gradeInfo.lectureName = gradeInfoStr[1];
        gradeInfo.midtermDate = getDateStr(gradeInfoStr[2]);
        gradeInfo.finalDate = getDateStr(gradeInfoStr[3]);
        gradeInfo.midtermGrade = Integer.parseInt(gradeInfoStr[4]);
        gradeInfo.finalGrade = Integer.parseInt(gradeInfoStr[5]);
    }
}
