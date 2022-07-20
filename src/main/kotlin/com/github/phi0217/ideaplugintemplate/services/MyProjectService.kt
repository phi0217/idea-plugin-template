package com.github.phi0217.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.phi0217.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
