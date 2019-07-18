def call(Map options = [:]) {
  sh 'summon/bin sourcery' + options.inject('') { r, k, v -> r + " --$k $v" }
}
