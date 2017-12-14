package com.matu.sample.action;

public class SampleAction {

	public String exectute() {

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		return "Return";
	}
}
