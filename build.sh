eval $(minikube docker-env)
mvn clean install
mvn spring-boot:build-image
docker push fabricio211/product-service:2.0.2
eval $(minikube docker-env -u)