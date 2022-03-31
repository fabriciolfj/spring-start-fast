istioctl manifest apply --set profile=demo

kubectl create ns product-new

kubectl label namespace product-new istio-injection=enabled
