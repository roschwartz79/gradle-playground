# TestSuites

This playground explores the use of custom test suites with the java plugin. See the docs [here](https://docs.gradle.org/current/userguide/jvm_test_suite_plugin.html)!

### Why would I want more than 1 test suite?
- Organization between unit, integration and functional tests
- The unit tests might not need all the database and application setup for each spec
- We can customize what test suites run first, so the long running integration tests don't all run before a short unit test fails for example
- Because gradle is cool and the customization seems endless

### Key points:
- The `jvm-test-suite` gradle plugin allows for easy configuration of JVM test suites. 
- By default, a test source set, configuration and test task are created. The given project is applied to the test classes classpaths by default. 
- New test suites can be easily added, however custom configurations must be added as well in order to properly keep the compile and runtime classpaths clean.

### Wish list/future learning:
- If I create custom source sets across mutliple modules in a multi module builds and the names are the same, can I just have 1 configuration created at the root level?
- Why do I have to create a custom configuration? It feels like that should be configured for me, but I need to further understand configurations and the test suite plugin. 

### Other readings:
[Testing with the Gradle TestKit](https://dev.to/autonomousapps/gradle-all-the-way-down-testing-your-gradle-plugin-with-gradle-testkit-2hmc)