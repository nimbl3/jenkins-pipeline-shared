def call(Map options = [:]) {
  sh 'summon/bin fastlane run scan' + options.inject('') { r, k, v -> r + " $k:\"$v\"" }
}
