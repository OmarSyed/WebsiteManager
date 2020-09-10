package storage

import java.io.Serializable

class HtmlPage(val head : HtmlHead, val body : HtmlBody) : Serializable
{

    override fun toString() : String
    {
        return ""
    }
}