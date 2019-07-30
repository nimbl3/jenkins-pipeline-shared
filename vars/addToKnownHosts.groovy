void call(String host) {
  if (sh(script: "ssh-keygen -F ${host}", returnStatus: true)) {
    sh "mkdir -p ~/.ssh"
    sh "ssh-keyscan \"${host}\" >> ~/.ssh/known_hosts"
  }
}
