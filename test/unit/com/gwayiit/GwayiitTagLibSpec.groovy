package com.gwayiit
import grails.plugin.spock.TagLibSpec

class GwayiitTagLibSpec extends TagLibSpec {

    def "Capitalize text"() {
        expect:
            tagLib.capitalizeText([text: name ], {}) as String == 'THANDO MAFELA'

        where:
            name = 'thando mafela'
    }

    def "render the next button"() {
        when:
            def output = tagLib.nextButton(className: className , {} ).toString()
        then:
            tagLib.renderArgs.template == '/parts/nextButton'
            tagLib.renderArgs.model.className == 'step1'
        where:
            className = 'step1'
    }

}
