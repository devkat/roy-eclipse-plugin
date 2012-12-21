package net.devkat.roy.editors

import org.eclipse.ui.editors.text.TextEditor

class RoyEditor extends TextEditor {

  var colorManager: ColorManager = new ColorManager();
  setSourceViewerConfiguration(new XMLConfiguration(colorManager));
  setDocumentProvider(new XMLDocumentProvider());

  def dispose() {
    colorManager.dispose();
    super.dispose();
  }

}
