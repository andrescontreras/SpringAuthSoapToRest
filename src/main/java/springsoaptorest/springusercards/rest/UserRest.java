package springsoaptorest.springusercards.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springsoaptorest.springusercards.dto.UserInformation;
import springsoaptorest.springusercards.impl.UserImpl;

@RestController
public class UserRest {

	@Autowired
	UserImpl userImpl;

	@RequestMapping("user")
	public ResponseEntity<UserInformation> getUserData() {
		try {
			UserInformation userInformation = userImpl.getUserData();
			return ResponseEntity.status(HttpStatus.OK).body(userInformation);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}

	}

}
