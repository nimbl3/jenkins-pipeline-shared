package co.nimblehq.command

class CommandSerializer {

  String serialize(Command command) {
    String serializedCommand = command.name

    if (command.action) {
      serializedCommand += " ${command.action}"
    }

    serializedCommand += command.options().inject('') { result, key, value ->
      if (value instanceof String) {
        "${result} ${key} ${value}"
      } else if (value) {
        "${result} ${key}"
      } else {
        result
      }
    }

    serializedCommand
  }
}
