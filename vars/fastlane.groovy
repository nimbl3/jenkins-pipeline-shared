import co.nimblehq.command.Summon
import co.nimblehq.command.Fastlane

def call(Map parameters = [:], String lane) {
  sh Fastlane.lane(parameters, lane)
}
