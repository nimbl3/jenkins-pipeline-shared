package co.nimblehq.command.fastlane

import co.nimblehq.command.Command

abstract class FastlaneCommand implements Command {

  final String name = 'fastlane'

  abstract Map options()
}
