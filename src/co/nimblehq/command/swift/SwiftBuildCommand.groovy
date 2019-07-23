package co.nimblehq.command.swift

class SwiftBuildCommand extends SwiftCommand {

  final String action = 'build'

  boolean buildTests = false
  String packagePath

  Map options() {
    [
      '--build-tests': buildTests,
      '--package-path': packagePath
    ]
  }
}
