package com.example.employee.repository

import com.example.employee.model.Employee
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : ReactiveMongoRepository<Employee, String>