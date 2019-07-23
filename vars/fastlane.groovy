import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map args = [:], String lane) {
  FastlaneCommand fastlaneCommand = new FastlaneCommand()
  fastlaneCommand.lane = lane
  fastlaneCommand.parameters = args
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  println(Summon.bin(commandSerializer.serialize(fastlaneCommand)))
}
