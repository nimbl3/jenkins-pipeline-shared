package co.nimblehq.command

abstract class CommandSerializer {

  abstract String argumentSeparator

  String serialize(Command command) {
    String serializedCommand = command.name

    if (command.action) {
      serializedCommand += " ${command.action}"
    }

    serializedCommand += command.options().inject('') { result, key, value ->
      if (value instanceof String) {
        "${result} ${key}${argumentSeparator}${value}"
      } else if (value) {
        "${result} ${key}"
      } else {
        result
      }
    }

    serializedCommand
  }
}
