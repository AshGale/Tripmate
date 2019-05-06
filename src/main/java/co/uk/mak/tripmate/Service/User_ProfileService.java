package co.uk.mak.tripmate.Service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import co.uk.mak.tripmate.Models.User_Profile;
import co.uk.mak.tripmate.Repository.ProfileRepository;

@Service
public class User_ProfileService {

	private final ProfileRepository profileRepository;

	public User_ProfileService(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	public Optional<User_Profile> findById(UUID id) {
		return profileRepository.findById(id);
	}
	
}
