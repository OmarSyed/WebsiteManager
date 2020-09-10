package storage

class HtmlBodyNode(var tag: HtmlBodyTag, var parent : HtmlBodyNode?, var children : ArrayList<HtmlBodyNode>)
{
    constructor(tag: HtmlBodyTag) : this(tag, null, ArrayList<HtmlBodyNode>())

    fun addChild(tag: HtmlBodyNode)
    {
        children.add(tag)
    }
}