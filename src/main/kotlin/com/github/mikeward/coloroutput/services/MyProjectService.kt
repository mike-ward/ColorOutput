package com.github.mikeward.coloroutput.services

import com.github.mikeward.coloroutput.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
