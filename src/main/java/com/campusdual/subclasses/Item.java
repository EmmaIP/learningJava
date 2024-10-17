package com.campusdual.subclasses;

public class Item {    //clase base o superclase con sus atributos básicos
    private String title;
    private String publicationDate;
    private boolean checkedOut = false;   //alquiler

    public Item(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getDetails() {
        return "Title: " + this.title + ", Publication Date: "
                + this.publicationDate + ", Checked out: " + this.checkedOut;
    }
}
