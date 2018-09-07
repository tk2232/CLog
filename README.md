# CLog

Install:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
```
  dependencies {
	        implementation 'com.github.tk2232:CLog:v0.1'
	}
```
  
Configuration:
```
CLog.configuration().logWithConsole(true).logWithFirebase(true);
```
