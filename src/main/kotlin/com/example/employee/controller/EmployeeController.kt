package com.example.employee.controller

import com.example.employee.model.Employee
import com.example.employee.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@CrossOrigin(origins = ["http://localhost:3000"], maxAge=3600, allowCredentials = "true")
class EmployeeController(

    @Autowired
    val employeeService : EmployeeService
) {
    @PostMapping("/createEmployee")
    fun createEmployee(@RequestBody emp: Employee): Mono<Employee> {
        return employeeService.addEmp(emp)
    }

    @GetMapping("employee/{id}")
    fun getEmpById(@PathVariable id: String): Mono<Employee> {
        return employeeService.findById(id)
    }
    @GetMapping("/allEmp")
    fun getAllEmp(): Flux<Employee> {
        return employeeService.findAllEmp()
    }
    @PutMapping("/update/{id}")
    fun updateById(@PathVariable id: String, @RequestBody emp: Employee): Mono<Employee> {
        return employeeService.updateEmpById(id,emp)
    }
    @DeleteMapping("/emp/{id}")
    fun deleteEmployee(@PathVariable id: String): Mono<Void> {
        return employeeService.deleteById(id)
    }

}
