package fr.esipe.fr.esipe.libraryservices.libray.models;


import java.util.ArrayList;

public class BookDto {

    private String title;
    private ArrayList<String> category;
    private boolean isnew;
    private ArrayList<ExemplaryDto> item;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }

    public boolean isIsnew() {
        return isnew;
    }

    public void setIsnew(boolean isnew) {
        this.isnew = isnew;
    }

    public ArrayList<ExemplaryDto> getItem() {
        return item;
    }

    public void setItem(ArrayList<ExemplaryDto> item) {
        this.item = item;
    }
}