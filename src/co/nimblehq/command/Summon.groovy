package co.nimblehq.command

class Summon {

  static String init() {
    'executable/init'
  }

  static String bin(String command) {
    "summon/bin ${command}"
  }
}
