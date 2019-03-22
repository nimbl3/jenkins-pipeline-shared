def call(String message) {
  sh "bundle exec fastlane ci_build_for_testing"
}