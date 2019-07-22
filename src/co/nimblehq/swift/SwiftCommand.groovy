package co.nimblehq.swift

class SwiftCommand {

  String build() {
    "swift ${command}" + options().inject('') { r, k, v ->
      if (v instanceof String) {
        "${r} ${k} ${v}"
      } else if (v) {
        "${r} ${k}"
      } else {
        r
      }
    }
  }
}
