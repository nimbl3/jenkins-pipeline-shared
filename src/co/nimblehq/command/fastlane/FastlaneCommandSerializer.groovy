package co.nimblehq.command.fastlane

import co.nimblehq.command.CommandSerializer

class FastlaneCommandSerializer extends CommandSerializer {

  final String optionSeparator = ':'

  String formatOptionKey(String key) {
    key.replaceAll(/([A-Z])/, /_$1/).toLowerCase()
  }

  def formatOptionValue(def value) {
    if (value instanceof GString || value instanceof String) {
      /"${value}"/
    } else if (value) {
      'true'
    } else {
      'false'
    }
  }
}
