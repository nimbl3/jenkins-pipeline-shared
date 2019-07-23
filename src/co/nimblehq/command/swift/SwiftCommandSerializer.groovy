package co.nimblehq.command.swift

import co.nimblehq.command.CommandSerializer

class SwiftCommandSerializer extends CommandSerializer {

  final String argumentSeparator = ' '

  String formatKey(String key) {
    "--${key.replaceAll(/([A-Z])/, /-$1/).toLowerCase()}"
  }

  def formatValue(def value) {
    value
  }
}
