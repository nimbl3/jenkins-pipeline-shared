package co.nimblehq.command.fastlane

class FastlaneCommand {

  final String name = 'fastlane'

  String lane
  Map parameters

  Map options() {
    Map parameters = parameters.clone()
    parameters[lane] = true
    parameters
  }
}
