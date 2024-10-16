package com.example.openapi.service

import com.example.openapi.model.Student
import com.example.openapi.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    fun list():List<Student>{
        return studentRepository.findAll()
    }

    fun post(student: Student):Student{
        return studentRepository.save(student)
    }

    fun findById(id: Long):Student?{
        return studentRepository.findById(id).orElse(null)
    }
}