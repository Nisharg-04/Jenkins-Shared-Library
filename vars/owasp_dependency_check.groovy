def call(){
  echo "Running OWASP Dependency Check"  
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
  echo "Finished OWASP Dependency Check"
}