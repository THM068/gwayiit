package com.gwayiit.specs
import geb.spock.GebSpec
import com.gwayiit.pages.HomePage

class HomePageSpec extends GebSpec {

    def 'Test if home page is opened successfully' () {
        when: 'home page is called'
            to HomePage

        then: 'Home page is displayed'
            at HomePage
    }
}
