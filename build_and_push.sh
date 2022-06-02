./gradlew clean build
docker build . -t salemisntend/cat-services:1.0.0 -f .\DockerFile
docker push salemisntend/cat-services:1.0.0
