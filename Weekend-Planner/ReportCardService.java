package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.sbeans.Student;

@Component("rcs")
public class ReportCardService 
{
	@Autowired
	private Student student;
	

	public void calculateGrade()
	{
		int tMarks=0;
		for(int marks:student.getMarks())
		{
			tMarks=tMarks+marks;
		}
		String grade=null;
		if(tMarks>450)
		{
		grade="A";
		}
		else if(tMarks>400)
		{
			grade="B";
		}
		else if(tMarks>350)
		{
			grade="B";
		}
		else if(tMarks>300)
		{
			grade="C";
		}
		else if(tMarks>250)
		{
			grade="D";
		}
		else if(tMarks>200)
		{
			grade="E";
		}
		else
		{
			grade="F";
		}

	System.out.println("Report Card for "+student.getName());
	System.out.println("Total Marks: "+tMarks);
	System.out.println("Grade:"+grade);
}
	
}
