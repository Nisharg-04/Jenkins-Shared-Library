def call(String GitUrl, String GitBranch){
    echo "Checking out code"
    git url: "${GitUrl}", branch: "${GitBranch}"
    echo "Code checked out"
}