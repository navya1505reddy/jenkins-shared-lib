
def call() {
    echo "Hello World from Shared Library"
    echo "Job Name: ${env.JOB_NAME}"
    echo "Build Number: ${env.BUILD_NUMBER}"
    if (env.GIT_BRANCH) {
        echo "Branch: ${env.GIT_BRANCH}"
    }
}
