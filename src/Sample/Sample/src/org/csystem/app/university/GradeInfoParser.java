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

        gradeInfo.setStudentName(gradeInfoStr[0]);
        gradeInfo.setLectureName(gradeInfoStr[1]);
        gradeInfo.setMidtermDate(getDateStr(gradeInfoStr[2]));
        gradeInfo.setFinalDate(getDateStr(gradeInfoStr[3]));
        gradeInfo.setMidtermGrade(Integer.parseInt(gradeInfoStr[4]));
        gradeInfo.setFinalGrade(Integer.parseInt(gradeInfoStr[5]));
    }
}
