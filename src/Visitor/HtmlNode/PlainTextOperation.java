package Visitor.HtmlNode;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("plain anchor text.");
    }

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("plain header text.");
    }
}
