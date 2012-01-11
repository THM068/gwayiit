grails.project.work.dir = "target"

grails.project.dependency.resolution = {
	inherits("global")
	log "warn"
	
	def gebVersion = "0.6.0"
	def seleniumVersion = "2.0rc3"
	
	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()
		mavenLocal()
		mavenCentral()
		
		// For Geb snapshot
		mavenRepo "https://nexus.codehaus.org/content/repositories/snapshots"
	}
	dependencies {
		test("org.seleniumhq.selenium:selenium-htmlunit-driver:$seleniumVersion") {
			exclude "xml-apis"
		}
		test("org.seleniumhq.selenium:selenium-chrome-driver:$seleniumVersion")
		test("org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion")

		// You usually only need one of these, but this project uses both
		test "org.codehaus.geb:geb-spock:$gebVersion"
		test "org.codehaus.geb:geb-junit4:$gebVersion"

        runtime 'mysql:mysql-connector-java:5.1.13'
	}
	plugins {
	    test ":tomcat:$grailsVersion"
            test ":hibernate:$grailsVersion"
		
	    test ":geb:$gebVersion"
	    test ":spock:0.5-groovy-1.7"
        
            compile ":joda-time:1.2"
            compile ":jquery:1.6.1.1"
            compile ":jquery-ui:1.8.11"
            compile ":resources:1.1.3"
            compile ":zipped-resources:1.0"


            runtime ":build-test-data:1.1.1"
            runtime ":fixtures:1.0.1"
        
	}
}
