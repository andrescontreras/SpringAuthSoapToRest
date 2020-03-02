package springsoaptorest.springusercards.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import springsoaptorest.springusercards.dto.UserCardInformation;
import springsoaptorest.springusercards.dto.UserInformation;
import springsoaptorest.springusercards.soap.UserCardSoap;

@Component
public class UserCardImpl {
	
	@Autowired
	UserCardSoap userCardSoap;
	
	public List<UserCardInformation> getUserCardsData() throws Exception {
		List<UserCardInformation> userCards = new ArrayList<>();
		String username = null;
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
		    String currentUserName = authentication.getName();
		    username = currentUserName;
		}
		
		if(username != null)
		{
			userCards = userCardSoap.getUserCards(username);
			return userCards;
		}
		
		throw new Exception("Can´t get actual user ");
	}
	
}
