import co.nimblehq.command.swift.SwiftBuildCommand
import co.nimblehq.command.swift.SwiftCommandSerializer

def call(Map args = [:]) {
  SwiftBuildCommand swiftBuildCommand = new SwiftBuildCommand()
  swiftBuildCommand.buildTests = args.buildTests != null ? args.buildTests : true
  swiftBuildCommand.packagePath = args.packagePath
  SwiftCommandSerializer commandSerializer = new SwiftCommandSerializer()
  sh commandSerializer.serialize(swiftBuildCommand)
}
