
package tn.esprit.spring.service;



import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;

import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
	
	
	@Autowired 
	IEmployeService us;
	Integer Em;
	
	@Test
	public void testGetEmployeById() {
		Employe e =us.getEmployeeById(20); 
		assertEquals(20, e.getId());
	}
	
	@Test
	public void testDeleteEmployeById()
	{
		if(Em!=null){
		int i = us.deleteEmployeById(Em);
		
		assertEquals(0, i);}
		else {
			int i = us.deleteEmployeById(8);
			
			assertEquals(0, i);}
	}
	@Test
	public void testAddEmploye()  {
		
		Employe em = new Employe("ghribi", "rym", "ghribi.rym@esprit.tn", "123456", Role.ADMINISTRATEUR); 
		Employe employeAdded = us.addEmploye(em); 
		assertEquals(em.getNom(),employeAdded.getNom());
	}
	
	@Test
	public void testRetrieveAllEmployes() {
		List<Employe> listEmployes = us.retrieveAllEmployes(); 
		 
		assertEquals(16, listEmployes.size());
	}

	//@Test
	//public void testModifyUser() throws ParseException   {
		
		//Employe u = new Employe("ghribi", "farah","modif@esprit.tn","rym01", Role.INGENIEUR); 
	     // int i = us.updateEmployeById(1);
	     // Employe userUpdated  = us.updateEmploye(1); 
		//assertEquals(u.getPrenom(), userUpdated.getPrenom());
	//}
		
	@Test
	public void testModifyUser()
	{

		Employe u = new Employe("najai", "mariem","modif@esprit.tn","mariem1", Role.CHEF_DEPARTEMENT); 
	    
	      Employe userUpdated  = us.updateEmployeById(23,u); 
	      assertEquals(u.getNom(),userUpdated.getNom());
	}
}
    

