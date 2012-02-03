package com.gwayiit

class GwayiitTagLib {

    static namespace = "gw"


    def capitalizeText = { attrs, body ->
        String  name = attrs.text
        out << name.toUpperCase()
    }

    def nextButton = { attrs, body ->
        def className = attrs.className
        out << render(template: "/parts/nextButton", model: [className: className ])
    }
}
