databaseChangeLog = {

	changeSet(author: "thandomafela (generated)", id: "1328653982228-1") {
		createTable(tableName: "page_part") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "body", type: "LONGTEXT")

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "sub_page_header", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "teaser", type: "VARCHAR(500)")
		}
	}

	changeSet(author: "thandomafela (generated)", id: "1328653982228-2") {
		createTable(tableName: "person") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true")
			}

			column(name: "version", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "surname", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
