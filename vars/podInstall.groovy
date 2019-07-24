import co.nimblehq.command.Summon
import co.nimblehq.command.Pod

def call(Map options = [:]) {
  sh Summon.bin(Pod.install(options))
}
