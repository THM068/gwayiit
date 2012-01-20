package com.gwayiit.pages

import geb.Module

class NavigationModule extends Module {

    static content = {
        homeLink { $('#homeLink') }
        productsLink { $('#productsLink') }
        teamLink { $('#teamLink') }
        aboutUsLink { $('#aboutUsLink') }
        recentNewsLink { $('#recentNewsLink') }
        contactUsLink { $('#contactUsLink') }
    }

}
