package com.example.epictechproject.presentation;

import com.example.epictechproject.entities.User;
import com.example.epictechproject.entities.UserProfile;
import com.example.epictechproject.repository.UserProfileRepository;
import com.example.epictechproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserProfileRestController {

    @Autowired
    UserProfileRepository userProfileRepository;
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/createUserProfile", method = RequestMethod.POST)
    public UserProfile createUserProfile(@RequestBody UserProfile userProfile,@AuthenticationPrincipal UserDetails currentUser){
        User user =  userRepository.findUserByEmail(currentUser.getUsername());
        userProfile.setUser(user);
        return  userProfileRepository.save(userProfile);
    }

    @RequestMapping(value = "/userProfileShow", method = RequestMethod.GET)
    public List<UserProfile> userProfileShow(@AuthenticationPrincipal UserDetails currentUser){
        System.out.println(currentUser.getUsername());

        return  userProfileRepository.findAllByEmail(currentUser.getUsername());
    }
}
