import co.nimblehq.command.swift.SwiftTestCommand
import co.nimblehq.command.swift.SwiftCommandSerializer

def call(Map options = [:]) {
  SwiftTestCommand swiftTestCommand = new SwiftTestCommand(options: options)
  SwiftCommandSerializer commandSerializer = new SwiftCommandSerializer()
  sh commandSerializer.serialize(swiftTestCommand)
}
