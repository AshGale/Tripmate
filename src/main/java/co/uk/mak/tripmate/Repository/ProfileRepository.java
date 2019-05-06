package co.uk.mak.tripmate.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import co.uk.mak.tripmate.Models.User_Profile;

public interface ProfileRepository extends CrudRepository<User_Profile, UUID>{

}
