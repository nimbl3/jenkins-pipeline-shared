import co.nimblehq.command.CommandSerializer
import co.nimblehq.command.swift.SwiftTestCommand

def call(Map args = [:]) {
  SwiftTestCommand swiftTestCommand = new SwiftTestCommand()
  swiftTestCommand.packagePath = args.packagePath
  CommandSerializer commandSerializer = new CommandSerializer()
  sh commandSerializer.serialize(swiftTestCommand)
}
