package springsoaptorest.springusercards.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import springsoaptorest.springusercards.dto.User;
import springsoaptorest.springusercards.soap.AuthenticateUserSoap;


@Service
public class UserPrincipalDetailsService implements UserDetailsService {
	
	@Autowired
    private AuthenticateUserSoap authenticateUserSoap;
	

    public UserPrincipalDetailsService() {
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.authenticateUserSoap.authenticateUser(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;
    }
}
