package com.gwayiit

class HomePageController {

    def index = {
        def pagePart = PagePart.findByName('home')
        [ pp: pagePart ]
    }

    def contact = {
        def pagePart = PagePart.findByName('contact')
        [ pp: pagePart ]
    }

    def team = {
        def pagePart = PagePart.findByName('team')
        [ pp: pagePart ]
    }

    def products = {
        def pagePart = PagePart.findByName('products')
        [ pp: pagePart ]
    }

    def recentNews = {}

    def aboutUs = {
        def pagePart = PagePart.findByName('aboutUs')
        [ pp: pagePart ]
    }
}
