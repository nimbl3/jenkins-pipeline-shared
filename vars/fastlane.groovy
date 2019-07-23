import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map parameters = [:], String lane) {
  FastlaneCommand fastlaneCommand = new FastlaneCommand(lane: lane, options: parameters)
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneCommand))
}
