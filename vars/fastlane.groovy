import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map args = [:], String lane) {
  FastlaneCommand fastlaneCommand = new FastlaneCommand(lane: lane, parameters: args)
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneCommand))
}
