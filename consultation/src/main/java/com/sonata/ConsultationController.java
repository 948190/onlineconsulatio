package com.sonata;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Consultation;
import com.sonata.model.ConsultationList;
import com.sonata.service.ConsultationService;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {

	@Autowired
	ConsultationService cs;
	
	
	@GetMapping("/")
	public ConsultationList getAvailable(){
		ConsultationList cl=new ConsultationList();
		cl.setList(cs.get());
		return cl;
	}
	
	@GetMapping("/{did}")
	public ConsultationList getDoctorSlots(@PathVariable int did){
		ConsultationList cl=new ConsultationList();
		cl.setList(cs.getDoctorSlots(did));
		return cl;
	}
	
	@GetMapping("/{did}/{pid}")
	public Consultation getSlots(@PathVariable int did, @PathVariable int pid){
		return cs.getSlots(pid,did);
	}
	
	@PostMapping("/")
	public int postSlot(@RequestBody Consultation c){
		cs.post(c);
		return c.getCid();
	}
	
	@PutMapping("/{did}/{pid}")
	public Consultation putSlot(@RequestBody Consultation c,@PathVariable int did,@PathVariable int pid){
		return cs.put(c,pid,did);
	}
	
	
	
	
	
}
