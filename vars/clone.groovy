def call(String url,String branch){
    git url: "${url}",master: "${branch}"
}