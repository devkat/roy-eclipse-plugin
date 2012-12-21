package net.devkat.roy.editors

import java.util.HashMap
import java.util.Iterator

import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.widgets.Display

class ColorManager {

  var fColorTable: Map[RGB, Color] = _;

  def dispose() {
    fColorTable.values.foreach(_.dispose())
  }

  def getColor(rgb: RGB): Color = {
    if (fColorTable.contains(rgb)) {
      fColorTable(rgb)
    } else {
      val color = new Color(Display.getCurrent(), rgb)
      fColorTable += (rgb -> color)
      color
    }
  }
}
