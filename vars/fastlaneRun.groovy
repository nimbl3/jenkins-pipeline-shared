import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneRunCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map args = [:], String fastlaneAction) {
  FastlaneRunCommand fastlaneRunCommand = new FastlaneRunCommand()
  fastlaneRunCommand.fastlaneAction = fastlaneAction
  fastlaneRunCommand.parameters = args
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneRunCommand))
}
