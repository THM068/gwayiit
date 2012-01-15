package com.gwayiit

class GwayiitTagLib {

    static namespace = "gw"


    def capitalizeText = { attrs, body ->
        String  name = attrs.text
        out << name.toUpperCase()

    }
}
