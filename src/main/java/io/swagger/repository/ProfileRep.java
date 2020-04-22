package io.swagger.repository;

import io.swagger.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRep extends JpaRepository<Profile, Long> {

}
