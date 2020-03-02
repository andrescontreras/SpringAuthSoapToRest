package springsoaptorest.springusercards.soap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import springsoaptorest.springusercards.dto.UserCardInformation;
import springsoaptorest.springusercards.dto.UserInformation;

@Component
public class UserCardSoap {

	public List<UserCardInformation> getUserCards(String username){
		
		List<UserCardInformation> userCards = new ArrayList<UserCardInformation>();
		for(int i = 0; i < 10 ; i++) {
			UserCardInformation userCardInformation =  new UserCardInformation();
			userCardInformation.setNumber("aaaa" + i * 100);
			userCardInformation.setType("bbbb" + i * 100);
			userCards.add(userCardInformation);
		}
		
		return userCards;
	}
}
