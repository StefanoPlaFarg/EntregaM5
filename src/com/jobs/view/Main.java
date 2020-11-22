package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
	try {	
		controller.createBossEmployee("Pepe Reina", "Dirección molona", "666666666", -4000.0);
		controller.createEmployee("Pedro Martinez", "Dirección molona 2", "665266666", 1500.0);
		controller.createEmployee("Laura Navarro", "Dirección molona 3", "625266666", 1000.0);
		controller.createVolunteer("Juan Palomar", "Dirección molona 4", "614266666");
		controller.createManagerEmployee("Renzo Minotti", "Dirección molona 2", "665226666", 2000.0);
	}catch (Exception e) {
		System.out.println("Hay algun/os datos introducidos que no son correctos");
		
	}
	
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();		
		String allSalaries=controller.getAllSalaries();	
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		System.out.println("SALARIES: " + allSalaries + " \n");
	}

}
