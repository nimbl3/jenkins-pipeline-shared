def call(String message) {
  def lastCommitMessage = env['COMMIT_MESSAGE'].isEmpty() ? getCommitMessage() : env['COMMIT_MESSAGE']
  if (lastCommitMessage.contains(message)) {
    echo "Found \'${message}\' in git latest commit message"
    return true
  }
  return false
}