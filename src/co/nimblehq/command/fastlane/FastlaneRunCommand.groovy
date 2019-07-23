package co.nimblehq.command.fastlane

class FastlaneRunCommand extends FastlaneCommand {

  final String action = 'run'

  String fastlaneAction
  Map parameters = [:]

  Map options() {
    Map parameters = convertKeysToSnakeCase(parameters)
    parameters[fastlaneAction] = true
    return parameters
  }
}
