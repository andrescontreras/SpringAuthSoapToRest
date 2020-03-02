package springsoaptorest.springusercards.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springsoaptorest.springusercards.dto.UserCardInformation;
import springsoaptorest.springusercards.dto.UserInformation;
import springsoaptorest.springusercards.impl.UserCardImpl;

@RestController
public class UserCardRest {

	@Autowired UserCardImpl userCardImpl;
	
	@RequestMapping("userCards")
	public ResponseEntity<List<UserCardInformation>> getUserData() {
		try {
			List<UserCardInformation> userCards = userCardImpl.getUserCardsData();
			return ResponseEntity.status(HttpStatus.OK).body(userCards);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}

	}
	
}
