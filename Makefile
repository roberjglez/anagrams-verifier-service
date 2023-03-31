compile-test:
	@mvn -q clean install
	@echo 'Compilation and testing finished'
execute-anagrams-verifier-service:
	@mvn -q clean compile exec:java -Dexec.mainClass="ApplicationScanner"