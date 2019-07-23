package co.nimblehq.command.fastlane

import co.nimblehq.command.Command

class FastlaneCommand implements Command {

  final String name = 'fastlane'

  String lane
  Map parameters = [:]

  Map options() {
    Map parameters = parameters.clone()
    parameters[lane] = true
    return parameters
  }
}
