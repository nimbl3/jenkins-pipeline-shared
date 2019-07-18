def call(Map args = [:]) {
  String options = ''
  if (args.packagePath != null) {
    options = " --package-path ${args.packagePath}"
  }
  sh 'swift test' + options
}
