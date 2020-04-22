/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
import io.swagger.annotations.*;
import netscape.javascript.JSObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T19:22:40.372Z")

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid username supplied"),
            @ApiResponse(code = 404, message = "User not found")})
    @RequestMapping(value = "/user/deleteUser/{userId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<Void> deleteUser(@ApiParam(value = "User can delete only itself", required = true) @PathVariable("userId") String userId) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Edit user", nickname = "editUser", notes = "User must be loged in.", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Incorrect data"),
            @ApiResponse(code = 404, message = "User not found")})
    @RequestMapping(value = "/user/editUser/{userId}",
            produces = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<Void> editUser(@ApiParam(value = "User can only edit itself.", required = true) @PathVariable("userId") String userId, @ApiParam(value = "contain user in JSON", required = true) @Valid @RequestBody User user) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get user by user name", nickname = "getUserByName", notes = "", response = User.class, tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = User.class),
            @ApiResponse(code = 400, message = "Invalid username supplied"),
            @ApiResponse(code = 404, message = "User not found")})
    @CrossOrigin
    @RequestMapping(value = "/user/{username}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<List<User>> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ", required = true) @PathVariable("username") String username) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = String.class),
            @ApiResponse(code = 400, message = "Invalid username/password supplied")})
    @RequestMapping(value = "/user/login",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username, @NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation")})
    @RequestMapping(value = "/user/logout",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<Void> logoutUser() {
//        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
//        } else {
//            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
//        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Add new user", nickname = "registerUser", notes = "", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "incorrect data"),
            @ApiResponse(code = 404, message = "User cannot be created")})
    @RequestMapping(value = "/user/addNewUser",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST)
    default ResponseEntity<User> registerUser(@ApiParam(value = "Contain new user in JSON", required = true) @Valid @RequestBody User user) {
//        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
//        } else {
//            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
//        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @ApiOperation(value = "test", nickname = "test", notes = "", tags = {"user",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation")})
    @RequestMapping(value = "/user/test",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    default ResponseEntity<User> test() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
