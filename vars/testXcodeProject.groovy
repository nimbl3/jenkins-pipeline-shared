import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map args = [:]) {
  FastlaneCommand fastlaneCommand = new FastlaneCommand(lane: 'scan', parameters: args)
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneCommand))
}
