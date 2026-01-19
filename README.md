# jenkins-shared-lib
jenkins shared library

## Vars

- `helloWorld` — Prints Hello World with build metadata.
- `cleanWsSafe` — Cleans workspace safely (uses `cleanWs()` if available, else `deleteDir()`).

## Usage

In a Jenkins pipeline:

```groovy
@Library('smartapi-shared') _
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                helloWorld()
            }
        }
    }
    post {
        always {
            cleanWsSafe()
        }
    }
}
