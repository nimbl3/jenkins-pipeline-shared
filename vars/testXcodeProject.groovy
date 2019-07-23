def call(Map args = [:]) {
  GroovyShell groovyShell = new GroovyShell()
  File file = new File('vars/fastlane.groovy')
  def fastlane = groovyShell.parse(file)
  fastlane.call args, 'scan'
}
