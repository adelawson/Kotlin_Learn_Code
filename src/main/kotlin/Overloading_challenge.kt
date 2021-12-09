fun main (){
    val company = Company("MyOwnCompany")
// departments
    val developmentDepartment = Department("Development")
    val qaDepartment = Department("Quality Assurance")
    val hrDepartment = Department("Human Resources")
// employees
    var Julia = Employee(company, "Julia", 100_000)
    var John = Employee(company, "John", 86_000)
    var Peter = Employee(company, "Peter", 100_000)
    var Sandra = Employee(company, "Sandra", 75_000)
    var Thomas = Employee(company, "Thomas", 73_000)
    var Alice = Employee(company, "Alice", 70_000)
    var Bernadette = Employee(company, "Bernadette", 66_000)
    var Mark = Employee(company, "Mark", 66_000)

    Julia++

    println(Julia.salary)
}

class Employee(val company: Company, val name: String, var salary: Int){

    operator fun inc():Employee{
        salary+=5000
        println("Ope ohhhh")
        return this
    }
}

class Company(val name: String) {
    val departments: ArrayList<Department> = arrayListOf()
}

class Department(val name: String) {
    val employees: ArrayList<Employee> = arrayListOf()
}