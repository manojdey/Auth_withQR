package com.auth.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class UserDataRestController {

    private final UserDataRepository userDataRepository;

    public UserDataRestController(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    // GET → /userdata/all
    @GetMapping("/getAllUserData")
    public List<UserData> getAllUsers() {
    	System.out.println("---------------@GetMapping(getAllUserData");
        return userDataRepository.findAll();
    }
}
