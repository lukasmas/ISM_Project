package io.swagger.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.model.Profile;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.repository.ProfileRep;
import io.swagger.repository.UserRep;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.spring.web.json.Json;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T19:22:40.372Z")

@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private UserRep userRep;

    private ProfileRep profileRep;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request, UserRep userRep, ProfileRep profileRep) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.userRep = userRep;
        this.profileRep = profileRep;
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "User can delete only itself", required = true) @PathVariable("userId") String userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> editUser(@ApiParam(value = "User can only edit itself.", required = true) @PathVariable("userId") String userId, @ApiParam(value = "contain user in JSON", required = true) @Valid @RequestBody User user) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ", required = true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        List<User> matchUsers = new ArrayList<User>();
        for (User user : userRep.findAll()) {
            if (user.getUsername().contains(username)) {
                matchUsers.add(user.password("").email(""));
            }
        }
        return new ResponseEntity<>(matchUsers, HttpStatus.OK);
    }

    public ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username, @NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("aeiou", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> logoutUser() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> test() {
        String accept = request.getHeader("Accept");
        User x = userRep.findOne(1L);
        log.error(x.toString());
        try {
            return new ResponseEntity<User>(x, HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<User> registerUser(@ApiParam(value = "Contain new user in JSON", required = true) @Valid @RequestBody User newUser) {
        String accept = request.getHeader("Accept");
        JSONObject jo = new JSONObject();
        List<User> userList = userRep.findAll();
        for (User user : userList) {

            if (newUser.getEmail().equals(user.getEmail())) {
                newUser.setId(-1L);
                newUser.setEmail("Already taken");
            }
            if (newUser.getUsername().equals(user.getUsername())) {
                newUser.setId(-1L);
                newUser.setUsername("Already taken");
            }

            if (newUser.getId() == -1L)
                return new ResponseEntity<>(newUser.password(""), HttpStatus.OK);


        }
        Profile newProfile = profileRep.save(new Profile());

        newUser.setProfileId(newProfile.getId());
        userRep.save(newUser);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
