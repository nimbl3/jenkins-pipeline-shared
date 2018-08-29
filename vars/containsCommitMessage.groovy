def call(String message) {
  def lastCommitMessage = sh(script: "git log -1", returnStdout: true) as String
  if (lastCommitMessage.contains(message)) {
    echo "Found \'${message}\' in git latest commit message"
    return true
  }
  return false
}