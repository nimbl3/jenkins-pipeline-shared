package co.nimblehq.command

abstract class CommandSerializer {

  abstract String optionSeparator

  abstract String formatOptionKey(String key)
  abstract def formatOptionValue(def value)

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

    if (command.hasProperty('options') && command.options) {
      serializedCommand += command.options.inject('') { result, key, value ->
        String formattedKey = formatOptionKey(key)
        def formattedValue = formatOptionValue(value)

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
