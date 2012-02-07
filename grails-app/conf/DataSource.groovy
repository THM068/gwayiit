dataSource {
	pooled = true
	dialect = 'org.hibernate.dialect.MySQLInnoDBDialect'
	driverClassName = 'com.mysql.jdbc.Driver'
	username = 'root'
	password = 'zinzilee'

	properties {
		maxActive = 50
		maxIdle = 25
		minIdle = 5
		initialSize = 5
		minEvictableIdleTimeMillis = 1000 * 60 * 5
		timeBetweenEvictionRunsMillis = 1000 * 60 * 5
		maxWait = 1200000
		testOnBorrow = true
		testWhileIdle = true
		testOnReturn = false
		validationQuery = 'SELECT 1'
	}

}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            url = 'jdbc:mysql://localhost:3306/gwayidb_dev?autoReconnect=true'
        }
    }
    dbdiff {
        dataSource {
            dbCreate = "create-drop"
            url = "jdbc:mysql://localhost/gwayi_diff"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = "zinzilee"
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:mem:testDb"
        }
    }
    production {
        dataSource {
            url = 'jdbc:mysql://localhost:3306/gwayidb?autoReconnect=true'
        }
    }
}
