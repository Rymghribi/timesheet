package tn.esprit.spring.services;


import java.util.List;


import tn.esprit.spring.entities.Employe;

import tn.esprit.spring.entities.Role;




public interface IEmployeService {
	
	
	public Employe getEmployeeById(int employeId);
	public int deleteEmployeById(int employeId);
	 public Employe updateEmploye(Employe em);
	 public Employe addEmploye(Employe em);
	 public List<Employe> retrieveAllEmployes();
	 
	

	
}
