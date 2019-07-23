import co.nimblehq.command.swift.SwiftCommandSerializer
import co.nimblehq.command.swift.SwiftBuildCommand

def call(Map args = [:]) {
  SwiftBuildCommand swiftBuildCommand = new SwiftBuildCommand()
  swiftBuildCommand.buildTests = args.buildTests != null ? args.buildTests : true
  swiftBuildCommand.packagePath = args.packagePath
  SwiftCommandSerializer commandSerializer = new SwiftCommandSerializer()
  sh commandSerializer.serialize(swiftBuildCommand)
}
