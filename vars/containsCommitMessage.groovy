def call(String message) {
  def containsMessage = sh (script: "git log -1 | grep '.*\\${message}.*'", returnStatus: true)
  if (containsMessage == 0) {
    echo "'${message}' found in git latest commit message"
    return true
  }
  return false
}