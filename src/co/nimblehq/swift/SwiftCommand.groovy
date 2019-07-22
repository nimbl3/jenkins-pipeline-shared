package co.nimblehq.swift

class SwiftCommand {

  String build() {
    "swift ${command}" + options().inject('') { r, k, v ->
      if (v) {
        "${r} ${k}"
      } else {
        r
      }
    }
  }
}
