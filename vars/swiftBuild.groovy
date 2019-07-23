import co.nimblehq.command.CommandSerializer
import co.nimblehq.command.swift.SwiftBuildCommand

def call(Map args = [:]) {
  SwiftBuildCommand swiftBuildCommand = new SwiftBuildCommand()
  swiftBuildCommand.buildTests = args.buildTests != null ? args.buildTests : true
  swiftBuildCommand.packagePath = args.packagePath
  CommandSerializer commandSerializer = new CommandSerializer()
  sh commandSerializer.serialize(swiftBuildCommand)
}
