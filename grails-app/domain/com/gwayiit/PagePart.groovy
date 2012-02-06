package com.gwayiit

class PagePart {
    String name
    String teaser
    String subPageHeader
    String body

    static constraints = {
        name blank: false, nullable: false
        teaser blank: true, nullable: true, maxSize: 500
        body blank: true, nullable: true, maxSize: 100000
        subPageHeader blank: true
    }
}
