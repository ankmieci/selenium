echo "running tests"
cd ..
mvn test surefire:test -Dtest=com.example.tests.samples.resolutions.ResolutionTest -Dbrowser=chrome