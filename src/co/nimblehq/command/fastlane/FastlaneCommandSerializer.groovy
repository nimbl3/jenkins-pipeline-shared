package co.nimblehq.command.fastlane

import co.nimblehq.command.CommandSerializer

class FastlaneCommandSerializer extends CommandSerializer {

  final String argumentSeparator = ':'

  String formatKey(String key) {
    key.replaceAll(/([A-Z])/, /_$1/).toLowerCase()
  }
}
