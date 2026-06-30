def call() {
    withCredentials([string(credentialsId: 'nvd-api-key', variable: 'NVD_API_KEY')]) {
        withEnv(["NVD_API_KEY=${NVD_API_KEY}"]) {

            dependencyCheck(
                additionalArguments: "--scan ./",
                odcInstallation: 'OWASP'
            )
        }
    }

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}