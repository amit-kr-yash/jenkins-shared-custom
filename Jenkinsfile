@Library("Shared-lib") _
pipeline{
    agent { label "agent-one" }
    stages{
        stage("Hello"){
            steps{
                script{
                    hello()
                }
            }
        }
        stage("Code"){
            steps{
                script{
                    clone("https://github.com/ameet56/django-notes-app.git","main")
                }
            }
        }
        stage("Build"){
            steps{
                script{
                    build("notes-app", "latest", "ameet56")
                }
            }
        }
        stage("Push to Docker Hub"){
            steps{
                script{
                    push("notes-app", "latest", "ameet56")
                }
            }
        }
        stage("Deploy"){
            steps{
                script{
                    deploy()
                }
            }
        }
    }
}