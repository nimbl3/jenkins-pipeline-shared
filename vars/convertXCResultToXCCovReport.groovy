def call() { 
    def derivedDataPath = env['DERIVED_DATA_PATH']
    if derivedDataPath.isEmpty { 
        return false
    } else { 
        def testResultDirectory = "${derivedDataPath}/Logs/Test"
        sh "xcparse codecov ${testResultDirectory}/*.xcresult ${testResultDirectory}"
    }
}