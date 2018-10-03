def call() {
  return sh(script: "git log -1", returnStdout: true) as String
}
