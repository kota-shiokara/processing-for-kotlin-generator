package jp.ikanoshiokara.p4k.generator

import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class P4KGeneratorModuleType: ModuleType<P4KGeneratorModuleBuilder>("P4K_WIZARD") {
    companion object {
        const val NAME = "Processing for Kotlin"
        const val DESCRIPTION = "Generate file from template of Processing for Kotlin"
        val PLUGINS_ICON by lazy { IconLoader.getIcon("/icons/example_icon16.png", P4KGeneratorModuleType::class.java) }
    }

    override fun createModuleBuilder(): P4KGeneratorModuleBuilder = P4KGeneratorModuleBuilder()
    override fun getName(): String = NAME
    override fun getDescription(): String = DESCRIPTION
    override fun getNodeIcon(isOpened: Boolean): Icon = PLUGINS_ICON
    override fun getIcon(): Icon = PLUGINS_ICON
}