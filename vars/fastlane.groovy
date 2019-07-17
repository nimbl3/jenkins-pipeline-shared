def call(String lane) {
  sh "summon/bin fastlane ${lane}"
}
