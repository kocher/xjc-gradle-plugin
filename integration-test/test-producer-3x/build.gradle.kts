plugins {
    id("java")
    id("com.github.bjornvester.xjc")
}

repositories {
    jcenter()
}

xjc {
    generateEpisode.set(true)
    xsdFiles = files(xsdDir.file("MySchemaWithFunnyChar.xsd"))
    xjcVersion.set("3.0.0")
}
