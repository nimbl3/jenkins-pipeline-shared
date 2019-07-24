import co.nimblehq.command.Summon
import co.nimblehq.command.Fastlane

def call(Map parameters = [:], String action) {
  sh Summon.bin(Fastlane.run(parameters, action))
}
