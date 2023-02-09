package Visitor.HtmlNode;

public interface Operation {
    void apply(AnchorNode anchor);
    void apply(HeadingNode heading);
}
