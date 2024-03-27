package com.example.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
}
