def testInput
stage('first') {
    try {
        timeout(1440) {
	    testInput = input message: "Provide input", parameters: [choice(choices: existingProductVersions, description: "select", name: 'lastInput')]
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
		    ls -l
                """
            }
        }
	}
}
