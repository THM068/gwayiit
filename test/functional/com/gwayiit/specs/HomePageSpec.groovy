package com.gwayiit.specs
import geb.spock.GebSpec
import com.gwayiit.pages.HomePage
import com.gwayiit.pages.ContactPage

class HomePageSpec extends GebSpec {

    def 'Test if home page is opened successfully' () {
        when: 'home page is called'
            to HomePage

        then: 'Home page is displayed'
            at HomePage
    }

    def "test if the contact page is displayed"() {
        when: 'contact page is called'
            to ContactPage

        then: 'Contact page is opened'
            at ContactPage

        and:'header title is present'
            header.text() == 'Contact Us'

        and: 'form fields are visible'
            fullName.displayed
            email.displayed
            phone.displayed
            comment.displayed
            submitButton.displayed

    }
}
