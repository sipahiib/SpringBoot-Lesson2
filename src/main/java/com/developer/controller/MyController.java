package com.developer.controller;

import com.developer.model.User;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    /*
    //http://localhost:9090/api/message1/deneme
    @GetMapping("/message1/{m}")
    public String getMyMessage1(@PathVariable("m") String message) {
        return "Your message is: " + message;
    }

    //http://localhost:9090/api/message2?m=deneme
    @GetMapping("/message2")
    public String getMyMessage2(@RequestParam("m") String message) {
        return "Your message is: " + message;
    }*/

    /*
    //http://localhost:9090/api/message1/deneme
    //http://localhost:9090/api/message1
    @GetMapping({"/message1", "/message1/{m}"})
    public String getMyMessage1(@PathVariable(name = "m", required = false) String message) {
        return "Your message is: " + message;
    }

    //http://localhost:9090/api/message2?m=deneme
    //http://localhost:9090/api/message2
    @GetMapping("/message2")
    public String getMyMessage2(@RequestParam(name = "m", required = false, defaultValue = "Default message") String message) {
        return "Your message is: " + message;
    } */

    /*
    @PostMapping("users")
    public User saveUser(@RequestBody User user)
    {
        System.out.println("User saved");
        user.setPassword("");
        return user;
    }

    @PostMapping("allusers")
    public List<User> saveAllUser(@RequestBody List<User> users)
    {
        System.out.println("All users saved");
        users.forEach(user->user.setPassword(""));
        return users;
    }*/

    /*
    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader)
    {
        return "Your header is: " + myHeader;
    }*/


}
