package jp.ikanoshiokara.p4k.generator

import com.intellij.ide.util.projectWizard.ModuleWizardStep
import javax.swing.JComponent
import javax.swing.JLabel

class P4KGeneratorArtifactWizardStep: ModuleWizardStep() {
    override fun getComponent(): JComponent {
        return JLabel("Put your content here")
    }

    override fun updateDataModel() {
        TODO("Not yet implemented")
    }
}