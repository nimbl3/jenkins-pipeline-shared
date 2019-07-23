import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneRunCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map args = [:], String action) {
  FastlaneRunCommand fastlaneRunCommand = new FastlaneRunCommand(fastlaneAction: action, parameters: args)
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneRunCommand))
}
