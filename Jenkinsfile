pipeline {
	agent any

	tools {
		jdk 'OpenJDK 11 OpenJ9'
		maven 'Maven 3'
	}

	stages {
		stage('Configuration') {
			steps {
				echo "Building version 1.3.0.${BUILD_NUMBER}"
				sh 'mvn versions:set -DnewVersion=1.3.0.${BUILD_NUMBER}'
			}
		}

		stage('Build') {
			steps {
				sh 'mvn clean deploy -Dmaven.javadoc.skip=false -DskipTests=true'
			}
		}
	}

	post {
		always {
			recordIssues enabledForFailure: true, tools: [
				mavenConsole(),
				java(),
				javaDoc()
			]
		}
	}
 } 