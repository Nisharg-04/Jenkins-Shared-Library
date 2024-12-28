def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "Building Docker image ${ProjectName}:${ImageTag}"  
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Built Docker image ${ProjectName}:${ImageTag}"

}