#!groovy

//declaring a function
def decidePipeline(Map configMap) {
    type = configMap.get("type")
    switch(type) {
        case "nodejsEKS":
            nodeJSEKSPipeline(configMap)
            break
        case "javaEKS":
            javaEKSPipeline(configMap)
            break
        case "pythonEKS":
            pythonEKSPipeline(configMap)
            break               
        default:
            error "type is not matched" 
            break
    }
}