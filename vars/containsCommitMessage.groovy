def call(String message) {
  def commitMessage = env.COMMIT_MESSAGE
  def lastCommitMessage = commitMessage.isEmpty() ? getCommitMessage() : commitMessage
  if (lastCommitMessage.contains(message)) {
    echo "Found \'${message}\' in git latest commit message"
    return true
  }
  return false
}