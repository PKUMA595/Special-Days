package com.specialdays.entites;

import java.time.LocalDateTime;
import java.util.List;

public class User {
	private Long id;
	private String name;
	private String email;
	private String password;
	private String address;
	private Long contact;
	private LocalDateTime dob;
	private List<Event> events;
}
