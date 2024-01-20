package test.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.com.Entity.customer;
import test.com.Service.customerservice;

@RestController
@RequestMapping("/cst")
public class customercontroller 
{
	@Autowired
	private customerservice cstserv;
	@PostMapping("/creates")
	public customer create(@RequestBody customer cst)
	{
		return cstserv.create(cst);
	}

}
