package com.github.kotashiokara.processingforkotlingenerator.module

import com.intellij.ide.util.projectWizard.JavaModuleBuilder
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.util.IconLoader
import java.net.URI
import javax.swing.Icon

class IntellijPluginModuleBuilder: JavaModuleBuilder() {
}

class IntellijPluginModuleType: ModuleType<IntellijPluginModuleBuilder>("intellij") {
    companion object {
        const val NAME = "Processing for Kotlin Generator"
        const val DESCRIPTION = "Generate file from template of Processing for Kotlin"
        val PLUGINS_ICON by lazy { IconLoader.findIcon(URI.create("https://avatars.githubusercontent.com/u/50353938").toURL()) }
    }

    override fun createModuleBuilder(): IntellijPluginModuleBuilder {
        return IntellijPluginModuleBuilder()
    }

    override fun getName(): String = NAME

    override fun getDescription(): String = DESCRIPTION

    override fun getNodeIcon(isOpened: Boolean): Icon = PLUGINS_ICON!!

    override fun getIcon(): Icon = PLUGINS_ICON!!
}