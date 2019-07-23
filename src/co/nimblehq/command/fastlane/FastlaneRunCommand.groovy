package co.nimblehq.command.fastlane

class FastlaneRunCommand extends FastlaneCommand {

  final String action = 'run'

  String lane
  Map parameters = [:]

  Map options() {
    Map parameters = parameters.clone()
    parameters[lane] = true
    return parameters
  }
}
