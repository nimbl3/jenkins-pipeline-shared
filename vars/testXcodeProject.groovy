import co.nimblehq.command.Summon
import co.nimblehq.command.Fastlane

def call(Map parameters = [:]) {
  sh Summon.bin(Fastlane.run(parameters, 'scan'))
}
