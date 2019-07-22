import co.nimblehq.swift.SwiftBuildCommand

def call(Map args = [:]) {
  SwiftBuildCommand swiftBuildCommand = new SwiftBuildCommand()
  swiftBuildCommand.buildTests = args.buildTests != null ? args.buildTests : true
  swiftBuildCommand.packagePath = args.packagePath
  sh swiftBuildCommand.build()
}
