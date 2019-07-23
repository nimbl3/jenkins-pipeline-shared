package co.nimblehq.command.fastlane

import co.nimblehq.command.CommandSerializer

class FastlaneCommandSerializer extends CommandSerializer {

  final String optionSeparator = ':'

  String formatKey(String key) {
    key.replaceAll(/([A-Z])/, /_$1/).toLowerCase()
  }

  def formatValue(def value) {
    if (value instanceof String) {
      /"${value}"/
    } else if (value) {
      'true'
    } else {
      'false'
    }
  }
}
