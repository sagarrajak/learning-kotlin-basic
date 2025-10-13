package com.testkotlin

class Person(_firstName: String,_lastName: String,
             var height: Float = 0.0f, var age: Int = 0, var _isMarried: Boolean = false) {


    constructor(_firstName: String, _lastName: String, _partener: Person) : this(_firstName, _lastName){
        partener = _partener;
    }

    var isMarried = _isMarried
        private set;

    var firstName: String = _firstName
        set(value) {
            field = value;
            fullName = getName()
        }

    var lastName: String = _lastName
        set(value) {
            field = value
            fullName = getName()
        }
    var fullName: String = getName()
    var partener: Person? = null
        set(value)  {
            field = value;
            isMarried = field != null;
        }



    fun getName(): String {
        return "$firstName $lastName"
    }

    override fun toString(): String {
        return "$fullName $height $age $isMarried ${
            if (isMarried)  partener.toString() else "No Partner"}" ;
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Person) return false;
        return other.firstName == firstName &&
                other.lastName == lastName &&
                other.age == age &&
                other.partener == partener;
    }

    override fun hashCode(): Int {
        return firstName.hashCode() + lastName.hashCode() + isMarried.hashCode() + age.hashCode();
    }
}