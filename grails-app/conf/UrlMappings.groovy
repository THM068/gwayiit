class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		name home: "/"(controller:'homePage', action: 'index')
        name products: "/products"(controller:'homePage', action: 'products')
        name services: "/services"(controller:'homePage', action: 'services')
        name aboutUs: "/about-us"(controller:'homePage', action: 'aboutUs')
        name recentNews: "/recent-news"(controller:'homePage', action: 'recentNews')
        name contactUs: "/contact"(controller:'homePage', action: 'contact')

        "/login/$action"(controller: 'login')
        "/logout/$action"(controller: 'logout')
		"500"(view:'/error')
	}
}
