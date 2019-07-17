def call(Map options = [:]) {
  sh 'summon/bin sourcery' + options.inject('') { i, k, v -> i + " --$k $v" }
}
