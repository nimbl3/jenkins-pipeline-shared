import co.nimblehq.command.swift.SwiftBuildCommand
import co.nimblehq.command.swift.SwiftCommandSerializer

def call(Map options = [:]) {
  SwiftBuildCommand swiftBuildCommand = new SwiftBuildCommand(options: options)
  SwiftCommandSerializer commandSerializer = new SwiftCommandSerializer()
  sh commandSerializer.serialize(swiftBuildCommand)
}
