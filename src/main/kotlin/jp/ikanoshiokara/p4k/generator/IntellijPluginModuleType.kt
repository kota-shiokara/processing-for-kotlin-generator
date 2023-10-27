package jp.ikanoshiokara.p4k.generator

import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class IntellijPluginModuleType: ModuleType<IntellijPluginModuleBuilder>("intellijPluginWizard") {
    companion object {
        const val NAME = "Processing for Kotlin Generator"
        const val DESCRIPTION = "Generate file from template of Processing for Kotlin"
        val PLUGINS_ICON by lazy { IconLoader.getIcon("/icons/example_icon16.png", ClassLoader.getPlatformClassLoader()) }
        val INSTANCE = IntellijPluginModuleType()
    }

    override fun createModuleBuilder(): IntellijPluginModuleBuilder = IntellijPluginModuleBuilder()
    override fun getName(): String = NAME
    override fun getDescription(): String = DESCRIPTION
    override fun getNodeIcon(isOpened: Boolean): Icon = PLUGINS_ICON
    override fun getIcon(): Icon = PLUGINS_ICON
}