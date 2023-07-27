fun main() {
    val user = User()
    user.setAge(19)
    user.setName("Vitaliy")

    println("Name: ${user.getName()}, Age: ${user.getAge()}")

    // но на самом деле в котлин не нужно создавать геттеры и сеттеры, котлин автоматически создает их
    val user2 = User2()
    user2.age = 18
    user2.name = "Anastasiya"

    println("Name: ${user2.name}, Age: ${user2.age}")

    /* почему это не является нарушением инкапсуляции? поля в котлин являются свойствами, которые по умолчанию имеют
       getter и setter, которые мы можем переопределить */

    user2.name = null
    println("Name: ${user2.name}") // таким образом мы показали, что это не просто обращение к public полю, вызвался его getter

    user2.age = -15 // вызвался setter с проверкой -> значение не присвоилось
    println("Name: ${user2.age}")

    // домашнее задание
    val dog = Dog()
    dog.name = "бобик"
    dog.age = 5
    dog.weight = 10.5

    dog.age = 0
    dog.weight = .0

    println("Кличка: ${dog.name}, возраст: ${dog.age}, вес: ${dog.weight}")
}