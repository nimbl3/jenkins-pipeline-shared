def call(String... options) {
  sh 'summon/bin pod install' + options.inject('') { r, v -> r + " --$v" }
}
