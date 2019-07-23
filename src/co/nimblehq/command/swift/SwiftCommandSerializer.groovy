package co.nimblehq.command.swift

import co.nimblehq.command.CommandSerializer

class SwiftCommandSerializer extends CommandSerializer {

  final String optionSeparator = ' '

  String formatOptionKey(String key) {
    "--${key.replaceAll(/([A-Z])/, /-$1/).toLowerCase()}"
  }

  def formatOptionValue(def value) {
    if (value instanceof GString || value instanceof String) {
      /"${value}"/
    } else {
      value
    }
  }
}
