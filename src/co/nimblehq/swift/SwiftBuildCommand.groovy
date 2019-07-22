package co.nimblehq.swift

class SwiftBuildCommand extends SwiftCommand {

  final String command = 'build'

  boolean buildTests = true

  Map options() {
    [
      '--build-tests': buildTests
    ]
  }
}
