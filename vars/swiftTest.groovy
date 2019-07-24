import co.nimblehq.command.Swift

def call(Map options = [:]) {
  sh Swift.test(options)
}
