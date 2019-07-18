def call(Map options = [:]) {
  sh 'summon/bin tuist generate' + options.inject('') { r, k, v -> r + " --$k $v" }
}
