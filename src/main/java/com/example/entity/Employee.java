package com.example.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(value = "employees")
public class Employee {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
}