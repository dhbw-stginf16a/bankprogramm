/**
* @ Author: Rick
* @ Creation Date: 24.05.2017
*/
package de.bankprogramming.models;

import java.time.LocalDate;
import java.time.Period;

import de.bankprogramming.helper.CustomerHelper;
import de.bankprogramming.models.enums.Gender;

public class Customer {

	// fields
	long customerId;
	String name;
	String address;
	String telNumber;
	LocalDate dateOfBirth;
	boolean validated;
	Gender gender;

	public Customer(final String name, final String address, final String telNumber, final LocalDate dateofBirth,
			final boolean validated, final Gender gender) {
		customerId = CustomerHelper.getInstance().getCustomerID();
		this.name = name;
		this.address = address;
		this.telNumber = telNumber;
		this.dateOfBirth = dateofBirth;
		this.validated = validated;
		this.gender = gender;
	}

	public int getAge() {
		LocalDate now = LocalDate.now();
		Period p = Period.between(dateOfBirth, now);
		return p.getYears();
	}
}
