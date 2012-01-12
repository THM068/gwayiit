package com.gwayiit

class User  extends SecUser {
    String name
    String surname

    static constraints = {
        name(blank: false)
        surname(blank: false)
    }
}
