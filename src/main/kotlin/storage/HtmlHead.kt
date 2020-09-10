package storage

import java.io.Serializable

class HtmlHead(var title : String) : Serializable
{

    override fun toString() : String
    {
        return "<head> <title> $title </title> </head>"
    }

}
