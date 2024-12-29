def call() {
    timeout(time: 1, unit: "MINUTES") {
        def qualityGate = waitForQualityGate()
        if (qualityGate.status != 'OK') {
            error "Pipeline aborted due to quality gate failure: ${qualityGate.status}"
        }
    }
}
