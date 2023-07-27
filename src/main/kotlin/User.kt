class User {
    private var age: Int = 0 // полям нужно задавать значения по умолчанию (в отличие от Java)
    private var name: String? = null

    fun setAge(age: Int) {
        this.age = age
    }

    fun getAge() = age

    fun setName(name: String?) {
        this.name = name
    }

    fun getName() = name
}