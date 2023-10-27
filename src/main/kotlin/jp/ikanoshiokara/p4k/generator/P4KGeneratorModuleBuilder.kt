package jp.ikanoshiokara.p4k.generator

import com.intellij.ide.util.projectWizard.JavaModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.Disposable
import com.intellij.openapi.projectRoots.JavaSdk
import com.intellij.openapi.projectRoots.SdkTypeId
import com.intellij.openapi.roots.ModifiableRootModel
import com.intellij.openapi.roots.ui.configuration.ModulesProvider
import javax.swing.Icon

class P4KGeneratorModuleBuilder: JavaModuleBuilder() {
    override fun getPresentableName(): String = P4KGeneratorModuleType.NAME
    override fun getNodeIcon(): Icon = P4KGeneratorModuleType.PLUGINS_ICON
    override fun getGroupName(): String = P4KGeneratorModuleType.NAME
    override fun getWeight(): Int = BUILD_SYSTEM_WEIGHT - 1
    override fun getBuilderId() = "P4K_MODULE"
    override fun isSuitableSdkType(sdkType: SdkTypeId?) = sdkType === JavaSdk.getInstance()

    override fun getDescription(): String = "Create a Processing for Kotlin"
    override fun setupRootModel(rootModel: ModifiableRootModel) {
        super.setupRootModel(rootModel)
    }


    override fun getParentGroup(): String = P4KGeneratorModuleType.NAME

    override fun createWizardSteps(
        wizardContext: WizardContext,
        modulesProvider: ModulesProvider
    ): Array<ModuleWizardStep> = arrayOf(P4KGeneratorArtifactWizardStep())

    override fun getCustomOptionsStep(context: WizardContext?, parentDisposable: Disposable?) = P4KGeneratorArtifactWizardStep()
}