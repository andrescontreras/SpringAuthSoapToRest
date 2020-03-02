package springsoaptorest.springusercards.soap;

import org.springframework.stereotype.Component;

import springsoaptorest.springusercards.dto.User;

@Component
public class AuthenticateUserSoap {
	
	public User authenticateUser(String userName) {
		
		return new User("username123", "password123", "ADMIN", "ADMIN");
	}
}
