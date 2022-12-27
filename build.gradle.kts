repositories {
	mavenCentral()
	maven("https://repo.papermc.io/repository/maven-public/")
	maven("https://jitpack.io")
	maven("https://repo.codemc.org/repository/maven-public/")
}

dependencies {
	compileOnly("io.papermc.paper:paper-api:1.19.2-R0.1-SNAPSHOT")
	compileOnly("de.tr7zw:item-nbt-api-plugin:2.11.1")
}

plugins {
	id("xyz.jpenilla.run-paper") version "2.0.0"
	java
}

tasks {
	runServer {
		// Configure the Minecraft version for our task.
		// This is the only required configuration besides applying the plugin.
		// Your plugin's jar (or shadowJar if present) will be used automatically.
		minecraftVersion("1.19.2")
	}
}

java {
	toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}
