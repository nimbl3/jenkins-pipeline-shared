def call(Map options = [:]) {
  sh 'summon/bin tuist generate' + options.inject('') { i, k, v -> i + " --$k $v" }
}
