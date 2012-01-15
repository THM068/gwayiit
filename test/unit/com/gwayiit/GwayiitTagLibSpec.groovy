package com.gwayiit
import grails.plugin.spock.TagLibSpec

class GwayiitTagLibSpec extends TagLibSpec {

    def "Capitalize text"() {
        expect:
            tagLib.capitalizeText([text: name ], {}) as String == 'THANDO MAFELA'

        where:
            name = 'thando mafela'
    }


}
