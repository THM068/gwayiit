package com.gwayiit.pages
import geb.Page

class HomePage extends Page {

    static url = "/"
    static at = { title == 'Welcome to Gwayi It Solutions'}

    static content = {
        navigation { module NavigationModule }
    }
}
