package co.nimblehq.command

interface Command {

  String name
  String action
  Map options()
}
