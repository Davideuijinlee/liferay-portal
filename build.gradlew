compileOnly project(“:apps:frontend-taglib:frontend-taglib”)
	compileOnly project(“:apps:frontend-taglib:frontend-taglib-clay”)
4:36
compileOnly group: “com.liferay.portal”, name: “com.liferay.util.taglib”, version: “default”
4:40
assemble {
	dependsOn packageRunBuild
}
dependencies {
	compileOnly group: “com.liferay.portal”, name: “com.liferay.util.taglib”, version: “default”
	compileOnly project(“:apps:frontend-taglib:frontend-taglib”)
	compileOnly project(“:apps:frontend-taglib:frontend-taglib-clay”)
}
gulpBuild {
	enabled = false
}
publishNodeModule {
	enabled = false
}
