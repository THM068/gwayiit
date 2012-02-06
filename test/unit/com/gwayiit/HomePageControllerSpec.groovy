package com.gwayiit

import grails.plugin.spock.ControllerSpec


class HomePageControllerSpec extends ControllerSpec {

    def 'home page displays correct page part'() {
        given:'A pagepart in the database'
           def pagePart = new PagePart()
           pagePart.identity{
               name = nameText
               teaser = teaserText
               subPageHeader = subPageHeaderText
               body = bodyText
           }
           mockDomain PagePart, [pagePart]

        when: 'the home page is called'
            def model = controller.index()

        then: 'correct page part is displyed'
            model.pp.name ==  nameText
            model.pp.teaser == teaserText
            model.pp.subPageHeader == subPageHeaderText
            model.pp.body == bodyText


        where:
            nameText =  'home'
            teaserText = 'this is a teaser'
            subPageHeaderText = 'header'
            bodyText = 'I am the body'
    }
}
