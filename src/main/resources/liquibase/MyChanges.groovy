databaseChangeLog {

    changeSet(author: "sirsendu Konar", id: "2", runOnChange: "true", failOnError: "false") {
        addColumn(tableName: "DOMAIN") {
            column(name: "CODE", type: "bigint")
        }
    }
	// Demo of code Execution
	changeSet(author: "sirsendu Konar", id: "3", runOnChange: "true", failOnError: "false") {
		println "This is a print statement to show that code is executed"
	}
}
