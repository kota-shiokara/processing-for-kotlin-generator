package com.github.kotashiokara.processingforkotlingenerator

import com.intellij.ide.util.projectWizard.JavaModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.roots.ModifiableRootModel
import com.intellij.openapi.roots.ui.configuration.ModulesProvider

class IntellijPluginModuleBuilder: JavaModuleBuilder() {
    override fun setupRootModel(rootModel: ModifiableRootModel) {
        super.setupRootModel(rootModel)
    }

    override fun createWizardSteps(
        wizardContext: WizardContext,
        modulesProvider: ModulesProvider
    ): Array<ModuleWizardStep> {
        val parentSteps = super.createWizardSteps(wizardContext, modulesProvider)
        val mySteps = arrayOf<ModuleWizardStep>(IntellijPluginArtifactWizardStep())
        return parentSteps + mySteps
    }
}