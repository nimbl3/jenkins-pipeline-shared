package co.nimblehq.command.fastlane

class FastlaneCommand {

  final String name = 'fastlane'

  String lane
  Map parameters

  List arguments() {
    [lane]
  }

  Map options() {
    parameters
  }
}
