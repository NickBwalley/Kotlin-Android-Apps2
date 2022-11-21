package com.example.roomdb

interface StudentDao {
    
    @Insert //provide this annotation before your function name to insert data into dataBase
    fun insertNewStudent(student: Student)
    
    @Update // provide this annotation before your function name to update existing data in the database
    fun updateStudentData(student: Student)// try this functionality out on your own
    
    @Delete //provide this annotation before your function name to delete existing data from database
    fun deleteExistingStudent(student: Student) // try this functionality on your own
    
    // use the query annotation to provide a custom SQL query that is verifiable at run-time
    @Query("SELECT * FROM student_table")
    fun getRecords() : List<Student>
}