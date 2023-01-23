package pages.RozPage;

import pages.RozPage.components.HeaderComponent;

import java.util.ArrayList;
import java.util.List;

public class MainPage {
    public HeaderComponent header;

    public MainPage(){
        this.header = new HeaderComponent();
    }

    public List<String> getLastViewedProducts(){
        return new ArrayList<>();
    }
}
