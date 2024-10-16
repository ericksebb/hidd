package com.example.openapi.model
import jakarta.persistence.*


@Entity
@Table(name = "student")
class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false, nullable = false)
    var id: Long? = null
    var nui: String? = null
    var level: String? = null
    var fullname: String?= null
    var age: Int?= null
}