package jp.ikanoshiokara.p4k.generator

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.projectRoots.JavaSdk
import com.intellij.openapi.projectRoots.SdkTypeId
import com.intellij.openapi.roots.ModifiableRootModel
import com.intellij.openapi.roots.ui.configuration.ModulesProvider
import javax.swing.Icon

class P4KGeneratorModuleBuilder: ModuleBuilder() {
    override fun getPresentableName(): String = P4KGeneratorModuleType.NAME
    override fun getNodeIcon(): Icon = P4KGeneratorModuleType.PLUGINS_ICON
    override fun getGroupName(): String = P4KGeneratorModuleType.NAME
    override fun getBuilderId() = "P4K_MODULE"
    override fun isSuitableSdkType(sdkType: SdkTypeId?) = sdkType === JavaSdk.getInstance()

    override fun getDescription(): String = "Create a Processing for Kotlin"
    override fun setupRootModel(rootModel: ModifiableRootModel) {
        super.setupRootModel(rootModel)
    }

    override fun getModuleType(): ModuleType<*> = P4KGeneratorModuleType()

    override fun getParentGroup(): String = P4KGeneratorModuleType.NAME

    override fun createWizardSteps(
        wizardContext: WizardContext,
        modulesProvider: ModulesProvider
    ) = arrayOf(P4KGeneratorArtifactWizardStep())
}