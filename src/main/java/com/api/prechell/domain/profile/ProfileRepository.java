package com.api.prechell.domain.profile;

import com.api.prechell.legacy.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Profile findByUserId(Long userId);

}
