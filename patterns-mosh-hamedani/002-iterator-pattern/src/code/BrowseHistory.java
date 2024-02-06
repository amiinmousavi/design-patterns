package code;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    //    private List<String> urls = new ArrayList<>();

    private String[] urls = new String[10];
    private int count;

    //    public void push(String url) {
    //        urls.add(url);
    //    }

    public void push(String url) {
        urls[count++] = url;
    }

    //    public String pop() {
    //        var lastIndex = urls.size() - 1;
    //        var lastUrl = urls.get(lastIndex);
    //        urls.remove(lastUrl);
    //
    //        return lastUrl;
    //    }

    public String pop() {
        return urls[--count];
    }

    //    public List<String> getUrls() {
    //        return urls;
    //    }

    public Iterator createIterator() {
        //        return new ListIterator(this);
        return new ArrayIterator(this);
    }

    //    public class ListIterator implements Iterator {
    //        private BrowseHistory history;
    //        private int index;
    //
    //        public ListIterator(BrowseHistory history) {
    //            this.history = history;
    //        }
    //
    //        @Override
    //        public boolean hasNext() {
    //            return (index < history.urls.size());
    //        }
    //
    //        @Override
    //        public Object current() {
    //            return history.urls.get(index);
    //        }
    //
    //        @Override
    //        public void next() {
    //            index++;
    //        }
    //    }

    public class ArrayIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.length);
        }

        @Override
        public Object current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
