package com.github.teheidoma.springbeancreatorintellijplugin.services

import com.github.teheidoma.springbeancreatorintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
