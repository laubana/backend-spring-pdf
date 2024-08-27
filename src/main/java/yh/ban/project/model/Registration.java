package yh.ban.project.model;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "registration")
@Getter
@Setter
@ToString
public class Registration {
	@Id
	private String _id;
	@DBRef
	private Event event;
	@DBRef
	private User user;
	@CreatedDate
	private Instant createdAt;
	@LastModifiedDate
	private Instant updatedAt;
}