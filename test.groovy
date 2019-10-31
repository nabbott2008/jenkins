def testInput
stage('first') {
    try {
        timeout(1440) {
        def params = ['one', 'two']
	    testInput = input message: "Provide input", parameters: [choice(choices: params, description: "select", name: 'lastInput')]
            currentBuild.displayName = "${testInput}"

        }
    } catch(err) {
        echo "No input"
        return
    }
    node() {
        try {
	    deleteDir()
            retry(3) {
                sh """#!/bin/bash -x
		            touch ${testInput}
                    ls -l
                """
            }
        } catch(e) {
            throw e
        }
	}
}
