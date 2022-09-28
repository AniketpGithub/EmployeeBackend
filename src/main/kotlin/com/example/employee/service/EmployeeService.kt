package com.example.employee.service

import com.example.employee.model.Employee
import com.example.employee.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
@Service
class EmployeeService (
    @Autowired
    val employeeRepository: EmployeeRepository
        ){
    fun addEmp(emp: Employee): Mono<Employee> {
        return employeeRepository.save(emp)

    }

    fun findById(id: String): Mono<Employee>{
        return employeeRepository.findById(id)
    }

    fun findAllEmp() : Flux<Employee> {
        return employeeRepository.findAll()
    }


    fun updateEmpById(id:String, emp: Employee):Mono<Employee>{
        return employeeRepository.save(emp)
    }

    fun deleteById(id: String): Mono<Void>{
        return employeeRepository.deleteById(id)

    }
}