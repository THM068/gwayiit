class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller:'homePage', action: 'index')
        name contact: "/contact"(controller:'homePage', action: 'contact')

        "/login/$action"(controller: 'login')
        "/logout/$action"(controller: 'logout')
		"500"(view:'/error')
	}
}
