package co.nimblehq.command

abstract class CommandSerializer {

  abstract String argumentSeparator

  abstract String formatKey(String key)
  abstract def formatValue(def value)

  String serialize(def command) {
    String serializedCommand = command.name

    if (command.hasProperty('action') && command.action) {
      serializedCommand += " ${command.action}"
    }

    serializedCommand += command.options().inject('') { result, key, value ->
      String formattedKey = formatKey(key)
      String formattedValue = formatValue(value)

      if (formattedValue instanceof String) {
        "${result} ${formattedKey}${optionSeparator}\"${formattedValue}\""
      } else if (formattedValue) {
        "${result} ${formattedKey}"
      } else {
        result
      }
    }

    serializedCommand
  }
}
