def call(String author) {
  /* Note: The idea of this function
	We usually create new pull requests after pulling translation and bumping version 
	before releasing new version of the application.
	We also mark those pull requests with [skip-ci] to avoid re-building the whole pipeline.
	The problem is that we sometimes need to add more feature after commiting [skip-ci].
	By checking changes from the lastest [skip-ci] commit (which is made by the CI author)
	to the last commit, we can solve above issue.
	*/

	// Get the last commit Hash ID
	String lastCommitScript = "git log --pretty=format:%H -1"
	String lastCommitID = sh(script: lastCommitScript, returnStdout: true) as String

	// Get the last skip commit Hash ID, which is made by the author (Ex: dev@nimblehq.co)
	String lastSkipCommitScript = "git log --pretty=format:%H --author=${author} -1"
	String lastSkipCommitID = sh(script: lastSkipCommitScript, returnStdout: true) as String

	// Get the lastest commit information since the last time skipping CI by the author (Ex: dev@nimblehq.co)
	String latestCommitsInfoScript = "git log --cherry-pick ${lastCommitID}...${lastSkipCommitID}"
	String latestCommitsInfo = sh(script: latestCommitsInfoScript, returnStdout: true) as String

  return latestCommitsInfo.contains("[skip-ci]")
}
