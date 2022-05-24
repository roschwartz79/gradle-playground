## Gradle Plugins

*Probably* my favorite part about gradle. Lots of my work has been in actual implementation vs playgorunds. 

This is a very simple demonstration of how to setup plugins (to use locally that is). Although publishing them isn't much more work.

I have created a convention plugin in the `build-logic` directory. Then I have pulled this 
plugin into the `my-project` build where we can see the custom task and application plugin are available to use.

From the `my-project` directory, run `./gradlew :my-application:tasks` to see all the tasks we brought in. 
Then give `./gradlew :my-application:example1task` to run the custom task that I defined in the plugin.

### Notes
- This specific implementation isn't super applicable to the real world. However it does do a good job showing how simple it is to create plugins.
- Don't forget- plugins are just extensions of your build logic!
- To publish, add the `maven-publish` plugin.
- There are so many ways to go about writing Gradle plugins so give lots of options a try!