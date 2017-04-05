databaseChangeLog {

    changeSet(author: "sirsendu Konar", id: "1", runOnChange: "true", failOnError: "false") {
        createTable(tableName: "DOMAIN") {
            column(name: "id", type: "int8") {
                constraints(nullable: "false", primaryKey: "true")
            }
            column(name: "TEXT", type: "varchar(255)") { constraints(nullable: "false") }
            column(name: "CREATED", type: "timestamp")
        }
    }
}
