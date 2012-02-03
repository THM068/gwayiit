package com.gwayiit

class PersonService {

    static transactional = true

    def addPerson(person) {
        if(person){
            person.save()
        }
    }
}
