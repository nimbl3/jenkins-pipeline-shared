package co.nimblehq.command

abstract class CommandSerializer {

  abstract String argumentSeparator

  abstract String formatKey(String key)

  String serialize(def command) {
    String serializedCommand = command.name

    if (command.action) {
      serializedCommand += " ${command.action}"
    }

    serializedCommand += command.options().inject('') { result, key, value ->
      String formattedKey = formatKey(key)

      if (value instanceof String) {
        "${result} ${formattedKey}${argumentSeparator}${value}"
      } else if (value) {
        "${result} ${formattedKey}"
      } else {
        result
      }
    }

    serializedCommand
  }
}
