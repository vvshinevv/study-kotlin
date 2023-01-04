package chapter03

class User(val id: Int, val name: String, val address: String)

fun saveUserV1(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("can't save user. because of empty name")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("can't save user. because of empty address")
    }

    // db에 저저장
}

fun saveUserV2(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("can't save user. because of empty $fieldName")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun saveUserV3(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("can't save user. because of empty $fieldName")
        }

        validate(user.name, "Name")
        validate(user.address, "Address")
    }
}

fun saveUserV4(user: User) {
    user.validateBeforeSave()
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("can't save user. because of empty $fieldName")
        }

        validate(name, "Name")
        validate(address, "Address")
    }
}