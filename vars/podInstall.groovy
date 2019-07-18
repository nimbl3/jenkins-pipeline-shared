def call(String projectDirectory = '') {
  String options = ''
  if (projectDirectory != '') {
    options = " --project-directory=${projectDirectory}"
  }
  sh 'summon/bin pod install' + options
}
