def call() {
    timeout(time: 5, unit: "MINUTES") { // Increase the timeout as needed
        def qualityGate = waitForQualityGate()
        if (qualityGate.status != 'OK') {
            error "Pipeline aborted due to quality gate failure: ${qualityGate.status}"
        }
    }
}
