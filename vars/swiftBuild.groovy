import co.nimblehq.swift.SwiftBuildCommand

def call(Map args = [:]) {
  SwiftBuildCommand swiftBuildCommand = new SwiftBuildCommand()
  swiftBuildCommand.buildTests = args.buildTests ?: true
  sh swiftBuildCommand.build()
}
