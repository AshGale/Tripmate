package co.uk.mak.tripmate.Models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class User_Profile {

	@Id
	UUID id;
	
	@NonNull
	String name;
}
