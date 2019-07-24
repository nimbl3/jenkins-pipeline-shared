package co.nimblehq.command

import co.nimblehq.command.fastlane.*

class Fastlane {

  private static FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()

  static String lane(Map parameters, String lane) {
    FastlaneCommand fastlaneCommand = new FastlaneCommand(lane: lane, options: parameters)
    commandSerializer.serialize(fastlaneCommand)
  }

  static String run(Map parameters, String action) {
    FastlaneRunCommand fastlaneRunCommand = new FastlaneRunCommand(fastlaneAction: action, options: parameters)
    commandSerializer.serialize(fastlaneRunCommand)
  }
}
