# kotlin-gradle-config

Simple application to setup kotlin with gradle. Below are the steps to create kotlin project with gralde

- If you are using intellij , elcips IDE to create kotlin grale project,you can see Kotlin sources can be mixed with Java sources in the same folder, or in different folders. The default convention is using different folders:
  
  - project
    - src
     - main (root)
       - kotlin
       - java
- You can see the build.gralde file in project root folder 
  ## Apply plugins 
  - The Kotlin plugin needs to be applied apply plugin in build.gralde as below
    ```
    apply plugin: "kotlin"
    ```
   - Or  starting with Kotlin 1.1.1, the plugin can be applied using the Gradle plugins DSL:
    ```
      plugins {
            id "org.jetbrains.kotlin.jvm" version "1.3.11"
      }
    ```
    - The corresponding sourceSets property should be updated if not using the default convention:
      ```
      sourceSets {
          main.kotlin.srcDirs += 'src/main/myKotlin'
          main.java.srcDirs += 'src/main/myJava'
       }
      ```
  ## Configuring Dependencies
  - In addition to the kotlin-gradle-plugin as shown above, you need to add a dependency on the Kotlin standard library:
     ```
        repositories {
         mavenCentral()
        }
        dependencies {
            compile "org.jetbrains.kotlin:kotlin-stdlib"
        }
     ```
   - In Kotlin 1.1.x, use kotlin-stdlib-jre7 and kotlin-stdlib-jre8 instead.
   
 - Example for kotlin with gradle build file is [here](https://github.com/PradnyaBorkar/kotlin-gradle-config/blob/master/build.gradle)
