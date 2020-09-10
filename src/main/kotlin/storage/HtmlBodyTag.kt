package storage

import java.io.Serializable

class HtmlBodyTag(var tagName : String, var text : String, var attributes : HashMap<String, String>) : Serializable
{

}