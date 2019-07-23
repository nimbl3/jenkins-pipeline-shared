import co.nimblehq.command.swift.SwiftTestCommand
import co.nimblehq.command.swift.SwiftCommandSerializer

def call(Map args = [:]) {
  SwiftTestCommand swiftTestCommand = new SwiftTestCommand(packagePath: args.packagePath)
  SwiftCommandSerializer commandSerializer = new SwiftCommandSerializer()
  sh commandSerializer.serialize(swiftTestCommand)
}
