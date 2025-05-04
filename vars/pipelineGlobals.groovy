def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "905418111046"
        case 'qa':
            return "905418111046"
        case 'uat':
            return "905418111046"
        case 'pre-prod':
            return "905418111046"
        case 'prod':
            return "905418111046"
        default:
            return "nothing"
    } 
}