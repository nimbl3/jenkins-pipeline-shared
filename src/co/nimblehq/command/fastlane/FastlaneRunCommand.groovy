package co.nimblehq.command.fastlane

class FastlaneRunCommand extends FastlaneCommand {

  final String action = 'run'

  String fastlaneAction
  Map parameters

  List arguments() {
    [fastlaneAction]
  }

  Map options() {
    parameters
  }
}
