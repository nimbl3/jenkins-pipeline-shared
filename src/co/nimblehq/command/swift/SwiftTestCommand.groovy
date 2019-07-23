package co.nimblehq.command.swift

class SwiftTestCommand extends SwiftCommand {

  final String action = 'test'

  String packagePath

  Map options() {
    [
      '--package-path': packagePath
    ]
  }
}
