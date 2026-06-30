def call(String ProjectName, String ImageTag, String DockerHubUser){
    sh "whoami"
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
