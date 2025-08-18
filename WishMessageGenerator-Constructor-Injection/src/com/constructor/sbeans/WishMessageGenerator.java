package com.constructor.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time;

	public WishMessageGenerator(LocalTime time) {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
		this.time = time;
	}

	public void generateWishMessage(String name) {
		int hour = time.getHour();
		if (hour < 12) {
			System.out.println("Good Morning " + name);
		} else if (hour > 12 && hour < 18) {
			System.out.println("Good Afternoon " + name);
		} else if (hour > 18 && hour < 24) {
			System.out.println("Good Evening " + name);
		}
	}

}
