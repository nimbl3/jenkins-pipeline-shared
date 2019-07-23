package co.nimblehq.command.fastlane

class FastlaneRunCommand extends FastlaneCommand {

  final String action = 'run'

  String fastlaneAction
  Map options

  List arguments() {
    [fastlaneAction]
  }
}
