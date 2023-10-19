def call() {           
  timeout(time: 1, unit: 'HOURS') {
                  def qg= waitForQualityGate()
                if (qg.status!= 'OK'){
                    error "Pipeline aborted due to quality gate failure: ${qg.status}"
                }
            }         
                 echo 'Quality Gate Passed'
}