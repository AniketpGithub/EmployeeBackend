package com.example.employee.model

import org.springframework.data.annotation.Id

data class Employee (
    @Id
    val id: String?,
    val firstName: String?,
    val lastName: String?,
    val emailId: String?,
        )