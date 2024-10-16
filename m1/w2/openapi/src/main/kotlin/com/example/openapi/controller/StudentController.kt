package com.example.openapi.controller

import com.example.openapi.model.Student
import com.example.openapi.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list():List<Student>{
        return studentService.list()
    }

    @PostMapping
    fun post(@RequestBody student: Student):Student{
        return studentService.post(student)
    }

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable id: Long):Student{
        return studentService.findById(id) ?: throw Exception("Student not found")
    }
}