package co.nimblehq.swift

class SwiftBuildCommand extends SwiftCommand {

  final String command = 'build'

  boolean buildTests = false
  String packagePath

  Map options() {
    [
      '--build-tests': buildTests,
      '--package-path': packagePath
    ]
  }
}
