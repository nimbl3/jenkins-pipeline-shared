import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneRunCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map parameters = [:], String action) {
  FastlaneRunCommand fastlaneRunCommand = new FastlaneRunCommand(fastlaneAction: action, parameters: parameters)
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneRunCommand))
}
