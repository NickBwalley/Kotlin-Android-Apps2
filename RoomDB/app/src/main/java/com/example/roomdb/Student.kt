package com.example.roomdb

@Entity(tableName = "student_table") // must provide this annotation
data class Student(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name="id") val id: Long=0,
    @ColumnInfo(name="name") val userName: String,
    @ColumnInfo(name="YearOfBirth") val userYOB: String,
    @ColumnInfo(name="email") val userEmail: String
)
