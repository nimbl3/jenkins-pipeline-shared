def call(String message) {
  sh "bundle exec fastlane ci_code_signing_for_deploy"
}