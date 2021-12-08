node {
    stage('SCM Checkout'){
        git 'https://github.com/daniel4nnah/CRUD_easy.git'
    }
    stage('Compile-Package'){
        def mvnHome = tool name: 'Maven3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}
