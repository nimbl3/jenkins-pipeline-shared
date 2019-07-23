package co.nimblehq.command.fastlane

import co.nimblehq.command.Command

class FastlaneCommand implements Command {

  final String name = 'fastlane'

  String lane
  Map parameters = [:]

  Map options() {
    Map parameters = convertKeysToSnakeCase(parameters)
    parameters[lane] = true
    return parameters
  }

  Map convertKeysToSnakeCase(Map map) {
    Map convertedMap = [:]
    map.each { key, value ->
      String snakeCasedKey = key.replaceAll(/([A-Z])/, /_$1/).toLowerCase().replaceAll(/^_/, '')
      convertedMap[snakeCasedKey] = value
    }
    convertedMap
  }
}
