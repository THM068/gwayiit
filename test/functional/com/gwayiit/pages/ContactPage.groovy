package com.gwayiit.pages

import geb.Page


class ContactPage extends Page {

    static  url = '/contact'

    static at = {
        pageId.@value == "homePage-contact"
    }

    static content = {
        pageId { $('meta', name: 'contact') }
        header { $('h3', class: 'red') }
        fullName { $('input', name: 'name') }
        email { $('input', name: 'email') }
        phone { $('input', name: 'phone') }
        comment { $('textarea ', name: 'text') }
        submitButton { $('input', type: 'submit' ) }

    }
}




