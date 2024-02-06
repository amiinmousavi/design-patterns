package code;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    // Changing this to an array of strings with a fixed size, changes affect other classes
    // Need to be fixed using iterator-pattern

    //    private String[] urls = new String[10];

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);

        urls.remove(lastUrl);

        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
