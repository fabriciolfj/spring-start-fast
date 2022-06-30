helm repo add renovate https://docs.renovatebot.com/helm-charts
helm repo update

kubectl create ns renovate
helm install --generate-name \
    --set-file renovate.config=config.json \
    --set cronjob.schedule='*/1 * * * *' \
    --set existingSecret=renovate-secrets \
    renovate/renovate -n renovate