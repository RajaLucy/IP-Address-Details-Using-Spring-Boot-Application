package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.bindings.IpAddressDetails;
@Service
public class IpAddressServiceImp implements IpAddressService {

	@Override
	public IpAddressDetails getDetails(String ip) {
		
		String apiUrl="https://ipinfo.io/"+ip+"?token=2b87ff3c61d8aa";
		
		RestTemplate re = new RestTemplate();
 ResponseEntity<IpAddressDetails> forEntity = re.getForEntity(apiUrl, IpAddressDetails.class);
		
 IpAddressDetails body = forEntity.getBody();
 
 return body;
 
 
	
		
		
		
	}

}
