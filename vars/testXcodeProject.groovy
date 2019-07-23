import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneRunCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map parameters = [:]) {
  FastlaneRunCommand fastlaneRunCommand = new FastlaneCommand(fastlaneAction: 'scan', parameters: parameters)
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneRunCommand))
}
