kubectl get service istio-ingressgateway -o jsonpath='{.status.loadBalancer.ingress[0].ip}' --namespace=istio-system