package Visitor.HtmlNode;

public class HeilighthOperation implements Operation{
    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("heilighthing an anchor.");
    }

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("heaighlithing a header.");
    }
}
