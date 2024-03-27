package com.example.controller;

import com.example.dto.EmployeeDto;
import com.example.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {

	private EmployeeService employeeService;

	@PostMapping("/employees")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Mono<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		return employeeService.saveEmployee(employeeDto);
	}

	@GetMapping("/employees/{id}")
	public Mono<EmployeeDto> getEmployee(@PathVariable("id") String employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@GetMapping("/employees")
	public Flux<EmployeeDto> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@PutMapping("/employees/{id}")
	public Mono<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable("id") String employeeId) {
		return employeeService.updateEmployee(employeeDto, employeeId);
	}

	@DeleteMapping("/employees/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public Mono<Void> deleteEmployee(@PathVariable("id") String employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}
}