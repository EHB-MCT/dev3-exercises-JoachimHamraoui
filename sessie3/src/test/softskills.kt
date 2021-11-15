package test

class SoftSkills(
    val course: String,
    val courseDescr: String,
    val lengthOfCourse: String
) {
 fun displayCourse() {
     println("${course}: ${courseDescr}, ${lengthOfCourse}")
 }
}