eval $(minikube docker-env)
mvn clean install
mvn spring-boot:build-image
docker push fabricio211/product-service:1.0.0
eval $(minikube docker-env -u)