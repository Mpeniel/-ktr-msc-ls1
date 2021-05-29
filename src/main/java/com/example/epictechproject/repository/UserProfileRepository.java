package com.example.epictechproject.repository;

import com.example.epictechproject.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
    List<UserProfile> findAllByEmail(String username);
}
