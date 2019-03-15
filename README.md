# hello-istio
# Introduction
In this POC we will see how to do canary release using istio

# Setup AKS Cluster
* Create an aks cluster from azure portal
* In cloud console, connect to the cluster using the command: <b>az aks get-credentials --resource-group sidd-aks-poc-rg --name sidd-aks-poc-cluster</b>
* We will use the following two docker images: spatnaik77/hello-istio:1 & spatnaik77/hello-istio:2
* spatnaik77/hello-istio:1 returns 1.0 for /version
* spatnaik77/hello-istio:2 returns 2.0 for /version

# Install Istio on the AKS cluster

* download istio :     <b>curl -L https://git.io/getLatestIstio | sh -  </b>
* <b>cd istio-1.0.6/</b>
* <b> kubectl apply -f install/kubernetes/istio-demo.yaml </b> : This will create the istio-system namespace and grant RBAC permissions. Besides, it will deploy plugins for metrics and logs, configure mutual TLS authentication between Envoy sidecars, and install core Istio components.
* <b> kubectl label namespace default istio-injection=enabled </b> : This will automatically inject the side car for every pod
* Verify the installation using the following commands
* <b> kubectl get pods  -n istio-system </b>
* <b> kubectl get service  -n istio-system </b>


