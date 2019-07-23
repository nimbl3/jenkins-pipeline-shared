package co.nimblehq.command.swift

import co.nimblehq.command.Command

abstract class SwiftCommand implements Command {

  final String name = 'swift'

  abstract Map options()
}
