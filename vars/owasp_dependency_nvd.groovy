def call() {
    withCredentials([string(credentialsId: 'nvd-api-key', variable: 'NVD_API_KEY')]) {

        dependencyCheck(
            additionalArguments: "-Dnvd.api.key=${NVD_API_KEY} --scan ./",
            odcInstallation: 'OWASP'
        )
    }

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}