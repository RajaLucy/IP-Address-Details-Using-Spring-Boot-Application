package in.ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.IpAddressDetails;
import in.ashokit.service.IpAddressServiceImp;

@RestController
public class IpAddressController {
	
	
	@Autowired
	private IpAddressServiceImp ipAddServ;
	
	@GetMapping("/getMyIp")
     public String getAllDetails(@RequestParam("ip") String ip)
     {
    	  IpAddressDetails details = ipAddServ.getDetails(ip);
    	 String con="";
    	 if(details.getCountry().equals("IN"))
    	 {
    		 con="India";
    	 }
    	 return "City : "+ details.getCity()+"\n"+"State: "+details.getRegion()+"\n"+"Country: "+con;
    	 
    	 
    	 
    	 
     }
	
	

}
