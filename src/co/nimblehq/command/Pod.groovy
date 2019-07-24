package co.nimblehq.command

import co.nimblehq.command.pod.*

class Fastlane {

  private static PodCommandSerializer commandSerializer = new PodCommandSerializer()

  static String install(Map options) {
    PodInstallCommand podInstallCommand = new PodInstallCommand(options: options)
    commandSerializer.serialize(podInstallCommand)
  }
}
