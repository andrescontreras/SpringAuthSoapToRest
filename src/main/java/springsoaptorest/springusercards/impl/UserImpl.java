package springsoaptorest.springusercards.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import springsoaptorest.springusercards.dto.UserInformation;
import springsoaptorest.springusercards.soap.UserSoap;

@Component
public class UserImpl {
	
	@Autowired UserSoap userSoap;

	public UserInformation getUserData() throws Exception {
		
		String username =  null;
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
		    String currentUserName = authentication.getName();
		    username = currentUserName;
		}
		if(username != null)
		{
			UserInformation userInformation = userSoap.getUserInformation(username);
			return userInformation;
		}
		throw new Exception("Can´t get actual user ");
	}
}
