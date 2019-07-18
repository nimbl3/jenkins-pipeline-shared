def call(Map args = [:]) {
  String options = ''
  if (args.projectDirectory != null) {
    options = " --project-directory=${args.projectDirectory}"
  }
  sh 'summon/bin pod install' + options
}
