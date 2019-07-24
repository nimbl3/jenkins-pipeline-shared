import co.nimblehq.command.Summon
import co.nimblehq.command.Fastlane

def call(Map parameters = [:], String lane) {
  sh Summon.bin(Fastlane.lane(parameters, lane))
}
