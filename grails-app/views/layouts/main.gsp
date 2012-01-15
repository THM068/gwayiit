<!DOCTYPE html>
<html>
    <head>
        <title><g:layoutTitle default="Welcome to Gwayi IT Solutions" /></title>
        <r:use modules="app" />
        <r:layoutResources />
        <link rel="shortcut icon" href="${resource(dir: 'images', file: 'image_headline.jpg')}" type="image/x-icon">
        <g:if test="${!grailsApplication.config.no.google.analytics}">
	        <g:render template="../parts/analytics-head" />
	    </g:if>
        <g:layoutHead />
    </head>
    <body>
        <div id="homepage">
            <div id="wrapper">
                <g:render template="../parts/header" />
               	<g:render template="../parts/navigation" />
                <g:layoutBody />
                <r:layoutResources />
            </div>
          	<div class="clear"></div>
        </div>
    </body>
</html>
