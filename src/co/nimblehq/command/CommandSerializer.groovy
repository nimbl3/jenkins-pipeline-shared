package co.nimblehq.command

abstract class CommandSerializer {

  abstract String optionSeparator

  abstract String formatKey(String key)
  abstract def formatValue(def value)

  String serialize(def command) {
    String serializedCommand = command.name

    if (command.hasProperty('action') && command.action) {
      serializedCommand += " ${command.action}"
    }

    if (command.metaClass.respondsTo(command, 'arguments') && command.arguments()) {
      command.arguments().each { argument ->
        serializedCommand += / "${argument}"/
      }
    }

    if (command.metaClass.respondsTo(command, 'options') && command.options()) {
      serializedCommand += command.options().inject('') { result, key, value ->
        String formattedKey = formatKey(key)
        def formattedValue = formatValue(value)

        if (formattedValue instanceof GString || formattedValue instanceof String) {
          "${result} ${formattedKey}${optionSeparator}${formattedValue}"
        } else if (formattedValue) {
          "${result} ${formattedKey}"
        } else {
          result
        }
      }
    }

    serializedCommand
  }
}
