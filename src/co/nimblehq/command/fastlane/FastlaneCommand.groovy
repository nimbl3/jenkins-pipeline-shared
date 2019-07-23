package co.nimblehq.command.fastlane

class FastlaneCommand {

  final String name = 'fastlane'

  String lane
  Map options

  List arguments() {
    [lane]
  }
}
