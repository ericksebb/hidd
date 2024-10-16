package com.example.openapi.repository

import com.example.openapi.model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository:JpaRepository<Student, Long> {
}