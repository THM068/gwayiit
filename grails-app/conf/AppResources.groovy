modules = {

    'app' {
        defaultBundle 'core'
        resource url: 'css/main.css'
    }


    'images' {
		defaultBundle 'core'
		resource disposition:'image', url: 'images/arrow.jpg', attrs: [:]
        resource disposition:'image', url: 'images/background_form.jpg', attrs: [:]
        resource disposition:'image', url: 'images/background_header.jpg', attrs: [:]
        resource disposition:'image', url: 'images/background_homepage.jpg', attrs: [:]
        resource disposition:'image', url: 'images/image_headline.jpg', attrs: [:]
        resource disposition:'image', url: 'images/nav_selected.jpg', attrs: [:]
        resource disposition:'image', url: 'images/background_subpage.jpg', attrs: [:]
	}


}