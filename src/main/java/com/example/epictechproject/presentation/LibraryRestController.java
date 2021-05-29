package com.example.epictechproject.presentation;

import com.example.epictechproject.entities.Library;
import com.example.epictechproject.entities.User;
import com.example.epictechproject.entities.UserProfile;
import com.example.epictechproject.repository.LibraryRepository;
import com.example.epictechproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class LibraryRestController {

    @Autowired
    LibraryRepository libraryRepository;
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/createLibrary", method = RequestMethod.POST)
    public Library createUserProfile(@RequestBody Library library, @AuthenticationPrincipal UserDetails currentUser){
        User user =  userRepository.findUserByEmail(currentUser.getUsername());
        library.setUser(user);
        return  libraryRepository.save(library);
    }

}
