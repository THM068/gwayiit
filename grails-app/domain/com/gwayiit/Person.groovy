package com.gwayiit

class Person {
    String name
    String surname

    static constraints = {
        surname(blank: false)
        name(blank: false)
    }
}
