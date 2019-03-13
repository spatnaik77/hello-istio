# hello-istio
# Introduction
In this POC we will see how to do canary release using istio

# Setup
* Create an aks cluster from azure portal
* In cloud console, connect to the cluster using the command: <b>az aks get-credentials --resource-group sidd-aks-poc-rg --name sidd-aks-poc-cluster<b>
* We will use the following two docker images: spatnaik77/hello-istio:1 & spatnaik77/hello-istio:2
* spatnaik77/hello-istio:1 returns 1.0 for /version
* spatnaik77/hello-istio:2 returns 2.0 for /version
