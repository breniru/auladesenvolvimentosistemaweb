package br.com.senacsp.tads.stads4na.library.presentation;

import br.com.senacsp.tads.stads4na.library.domainmodel.User;
import br.com.senacsp.tads.stads4na.library.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
   // @RequestMapping(produces =  "json", method = RequestMethod.GET)
    public ResponseEntity<List<User>> fetchAllUsers(){
       return ResponseEntity.ok().body(this.userService.findall());
    }

}
