package co.nimblehq.command

import co.nimblehq.command.swift.*

class Swift {

  private static SwiftCommandSerializer commandSerializer = new SwiftCommandSerializer()

  static String build(Map options) {
    SwiftBuildCommand swiftBuildCommand = new SwiftBuildCommand(options: options)
    commandSerializer.serialize(swiftBuildCommand)
  }

  static String test(Map options) {
    SwiftTestCommand swiftTestCommand = new SwiftTestCommand(options: options)
    commandSerializer.serialize(swiftTestCommand)
  }
}
