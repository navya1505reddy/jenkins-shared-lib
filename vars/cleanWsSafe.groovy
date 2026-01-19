def call() {
    if (Jenkins.instance.pluginManager.getPlugin('workspace-cleanup')) {
        cleanWs()
    } else {
        deleteDir()
    }
}

