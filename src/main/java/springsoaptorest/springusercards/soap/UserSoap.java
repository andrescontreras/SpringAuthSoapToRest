package springsoaptorest.springusercards.soap;

import org.springframework.stereotype.Component;

import springsoaptorest.springusercards.dto.UserInformation;

@Component
public class UserSoap {
	
	public UserInformation getUserInformation(String username) {
		
		UserInformation userInformation =  new UserInformation();
		userInformation.setFirtsName("aaaa"+ username);
		userInformation.setLastNamer("bbbb"+ username);
		return userInformation;
	}

}
