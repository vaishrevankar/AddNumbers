agent any
stages {
stage ('initialise'){
steps{
sh '''
echo "PATH = ${PATH}"
echo "M2_HOME = ${M2_HOME}"
'''
}
}
stage ('build'){
steps{
sh 'mvn -Dmaven.test.failure.ignore=true install'
}
post {
success{

junit 'target/surefire-reports/**/*.xml'
}

}
}
stage("build & SonarQube analysis") {
		agent any 
		steps {
		withSonarQubeEnv('sonarqube') {
		sh 'mvn clean package sonar:sonar'
		}
	}
	}
}
}
	 