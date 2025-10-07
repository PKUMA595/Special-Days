package com.specialdays.entites;

import java.time.LocalDateTime;
import java.util.List;


public class Event {
	private Long id;
	private String title;
	private String description;
	private LocalDateTime date;
	private String location;
	private List<String> type = List.of("Birthday", "Anniversary", "Invitations", "Others");
}
