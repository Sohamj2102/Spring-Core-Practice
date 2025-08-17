package com.weekend.sbeans;

import java.time.LocalDate;

public class WeekendMessageGenerator
{
	private LocalDate date;//Has-A property
	//setter method for setter injection
	public void setDate(LocalDate date) {
		this.date = date;
	}
	//business method
	public String getWeekendMessage()
	{
		String getDayOfWeek =date.getDayOfWeek().name();
		if(getDayOfWeek.equals("Saturday") || getDayOfWeek.equals("Sunday"))
		{
			return "It's the Weekend!";
		}
		else {
			return "It's a Weekday.";
		}
	}

	
}
