package com.gwayiit

import grails.plugin.spock.UnitSpec

class PersonServiceUnitSpec extends UnitSpec {
    def personService
    def setup() {
        mockDomain Person

        personService = new PersonService()
    }

    def 'personService addPerson saves person to database'() {
        given:
            Person p = new Person(name: 'lorraine', surname: 'Mafela')

        when:
            personService.addPerson(p)
        then:
            def person = Person.get(1)
            person.name == 'lorraine'
            person.surname == 'Mafela'
    }

    def 'test old object' () {
        given:
            Person p = new Person(id:1,name: 'lorraine', surname: 'Mafela')
            mockDomain Person, [ p]
        when:
            p.name = 'thando'
        and:
            p.save()
        then:
            def oldP = old(Person.get(p.id))
            oldP.name != p.name
    }
}
