#helm repo add bitnami https://charts.bitnami.com/bitnami
helm install my-release bitnami/mysql --set auth.rootPassword=root,auth.database=product