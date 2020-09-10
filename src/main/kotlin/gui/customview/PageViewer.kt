package gui.customview

import javafx.event.EventHandler
import javafx.scene.control.RadioButton
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import javafx.scene.web.WebView
import storage.HtmlPage
import tornadofx.View

class PageViewer(var listOfPages: ArrayList<HtmlPage>) : View()
{
    override val root : BorderPane by fxml()
    private val leftPane : VBox by fxid()
    private val webView : WebView by fxid()

    init
    {
        showPages()
    }

    private fun showPages()
    {
        //populate the left side of scene with all current pages and set event handler for each
        leftPane.children.clear()
        for (page in listOfPages)
        {
            val pageRadioButton = RadioButton(page.head.title);
            pageRadioButton.setOnAction()
            {
                webView.engine.loadContent(page.toString())
            }
            leftPane.children.add(pageRadioButton)
        }
    }
}