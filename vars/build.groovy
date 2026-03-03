def call(String name){
    docker build -t ${name} .
}