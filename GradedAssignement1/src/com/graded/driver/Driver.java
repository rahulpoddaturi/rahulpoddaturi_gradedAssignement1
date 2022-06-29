package com.graded.driver;

import com.graded.model.AdminDepartment;
import com.graded.model.HRDepartment;
import com.graded.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// Creating object of admin department
		AdminDepartment adminObject = new AdminDepartment();
		System.out.println("Welcome to "+ adminObject.departmentName());
		System.out.println(adminObject.getTodaysWork());
		System.out.println(adminObject.getWorkDeadline());
		System.out.println(adminObject.isTodayAHoliday());
		System.out.println();
		
		// Creating object of Hr department
		HRDepartment hrObject = new HRDepartment();
		System.out.println("Welcome to "+ hrObject.departmentName());
		System.out.println(hrObject.doActivity());
		System.out.println(hrObject.getTodaysWork());
		System.out.println(hrObject.getWorkDeadline());
		System.out.println(hrObject.isTodayAHoliday());
		System.out.println();
		
		// Creating object of Tech department
		TechDepartment techObject = new TechDepartment();
		System.out.println("Welcome to "+ techObject.departmentName());
		System.out.println(techObject.getTodaysWork());
		System.out.println(techObject.getWorkDeadline());
		System.out.println(techObject.getTechStackInformation());
		System.out.println(techObject.isTodayAHoliday());
	}

}
