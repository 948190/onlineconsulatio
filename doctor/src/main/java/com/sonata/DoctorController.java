package com.sonata;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Doctor;
import com.sonata.model.DoctorList;
import com.sonata.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService ds;
	
	@GetMapping("/")
	public DoctorList getDoctors(){
		DoctorList dl=new DoctorList();
		dl.setList(ds.getDoctors());
		return dl;
	}
	
	@GetMapping("/{id}")
	public Doctor getDoctor(@PathVariable int id){
		return ds.getDoctor(id);
	}
	
	@GetMapping("/special/{special}")
	public DoctorList getDoctorsSpecial(@PathVariable String special){
		DoctorList dl=new DoctorList();
		dl.setList(ds.getDocSpecial(special));
		return dl;
	}
	
	@GetMapping("/{userName}/{password}")
	public int login(@PathVariable String userName, @PathVariable String password)
	{
		return ds.login(userName, password);
	}
	
	
	//@RequestMapping("/")
	//public String hi() {
		//return "hi";
	//}
	

}
